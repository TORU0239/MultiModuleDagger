package sg.toru.multimoduledagger.ui

import android.os.Bundle
import android.util.Log
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.lib.Hammer
import javax.inject.Inject

class SecondActivity : BaseActivity(R.layout.activity_second) {

    @Inject
    lateinit var hammer: Hammer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Second", "name:: ${hammer.name()}")
    }

    override fun initDependencyInjection() {
        (application as App).appComponent.hardwareShopComponent().inject(this)
    }
}
