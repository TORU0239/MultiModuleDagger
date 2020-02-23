package sg.toru.multimoduledagger.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentContainer
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.app.App
import sg.toru.multimoduledagger.di.component.HardwareShopComponent
import sg.toru.multimoduledagger.lib.Hammer
import sg.toru.multimoduledagger.ui.activity.BaseActivity
import sg.toru.multimoduledagger.ui.fragment.SecondFragment
import javax.inject.Inject

class SecondActivity : BaseActivity(R.layout.activity_second) {

    lateinit var hardwareShopComponent: HardwareShopComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SecondFragment.instance())
            .commitNow()
    }

    override fun initDependencyInjection() {
        hardwareShopComponent = (application as App).appComponent.hardwareShopComponent()
    }
}