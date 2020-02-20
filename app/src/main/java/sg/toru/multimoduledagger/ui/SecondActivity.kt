package sg.toru.multimoduledagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Hammer
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var hammer: Hammer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initDI()
        Log.e("Second", "name:: ${hammer.name()}")
    }

    private fun initDI() {
        (application as App).appComponent.hardwareShopComponent().inject(this)
    }
}
