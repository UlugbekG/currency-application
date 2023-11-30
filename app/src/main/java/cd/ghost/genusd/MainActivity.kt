package cd.ghost.genusd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cd.ghost.genusd.screens.CurrenciesFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DependencyProvider.init(this)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, CurrenciesFragment())
            .commit()

    }
}