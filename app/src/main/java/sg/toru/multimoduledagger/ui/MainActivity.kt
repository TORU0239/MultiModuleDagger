package sg.toru.multimoduledagger.ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Shop
import javax.inject.Inject

class MainActivity : BaseActivity(R.layout.activity_main) {

    @Inject
    lateinit var shop: Shop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<TextView>(R.id.txt_main).text = shop.printMenu()
        findViewById<TextView>(R.id.btn_next).setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }

    override fun initDependencyInjection() {
        (application as App).appComponent.shopComponent().inject(this)
    }
}