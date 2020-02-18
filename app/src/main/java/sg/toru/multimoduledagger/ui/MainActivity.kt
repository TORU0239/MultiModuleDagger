package sg.toru.multimoduledagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Hamburger
import sg.toru.multimoduledagger.lib.HotDog
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var burger:Hamburger

    @Inject
    lateinit var dog:HotDog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDependencyInjection()

        burger.test()
        dog.hotDog()
    }

    private fun initDependencyInjection() {
        (application as App).appComponent.inject(this)
    }
}