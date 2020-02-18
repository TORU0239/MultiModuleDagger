package sg.toru.multimoduledagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Hamburger
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var burger:Hamburger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDependencyInjection()

        burger.test()
    }

    private fun initDependencyInjection() {
        (application as App).appComponent.inject(this)
    }
}