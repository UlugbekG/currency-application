package cd.ghost.genusd.core

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.IdRes

class Resources(private val context: Context) {

    @SuppressLint("ResourceType")
    fun getString(@IdRes id: Int):String {
       return context.getString(id)
    }
}