package sg.toru.multimoduledagger.di.component

import dagger.Subcomponent
import sg.toru.multimoduledagger.di.PerActivityScope
import sg.toru.multimoduledagger.di.module.HardwareShopModule
import sg.toru.multimoduledagger.ui.activity.SecondActivity
import sg.toru.multimoduledagger.ui.fragment.SecondFragment

@PerActivityScope
@Subcomponent(modules = [HardwareShopModule::class])
interface HardwareShopComponent {
    fun inject(fragment: SecondFragment)
}