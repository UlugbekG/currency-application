package cd.ghost.genusd.core

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import java.io.Serializable
import kotlin.reflect.KProperty

inline fun <reified T : Serializable> Bundle.serializable(key: String): T? = when {
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU -> getSerializable(key, T::class.java)
    else -> @Suppress("DEPRECATION") getSerializable(key) as? T
}

inline fun <reified B : ViewBinding> Fragment.viewBinding(): ViewBindingDelegate<B> {
    val fragment = this
    return ViewBindingDelegate(fragment, B::class.java)
}

class ViewBindingDelegate<B : ViewBinding>(
    private val fragment: Fragment,
    private val viewBindingClass: Class<B>
) {

    var binding: B? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): B {
        val viewLifecycleOwner = fragment.viewLifecycleOwner
        if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.DESTROYED) {
            throw IllegalStateException("Called after onDestroyView()")
        } else if (fragment.view != null) {
            return getOrCreateBinding(viewLifecycleOwner)
        } else {
            throw IllegalStateException("Called before onViewCreated()")
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun getOrCreateBinding(lifecycleOwner: LifecycleOwner): B {
        return this.binding ?: let {
            val method = viewBindingClass.getMethod("bind", View::class.java)
            val binding = method.invoke(null, fragment.view) as B

            lifecycleOwner.lifecycle.addObserver(object : DefaultLifecycleObserver {
                override fun onDestroy(owner: LifecycleOwner) {
                    super.onDestroy(owner)
                    this@ViewBindingDelegate.binding = null
                }
            })

            this.binding = binding
            binding
        }
    }
}