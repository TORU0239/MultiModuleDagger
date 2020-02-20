package sg.toru.multimoduledagger.ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Hamburger
import sg.toru.multimoduledagger.lib.HotDog
import sg.toru.multimoduledagger.lib.Shop
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var shop: Shop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDependencyInjection()

        findViewById<TextView>(R.id.txt_main).text = shop.printMenu()

        findViewById<TextView>(R.id.btn_next).setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }

    private fun initDependencyInjection() {
        (application as App).appComponent.shopComponent().inject(this)
    }
}