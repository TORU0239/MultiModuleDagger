package sg.toru.multimoduledagger.di.component

import dagger.Subcomponent
import sg.toru.multimoduledagger.di.PerActivityScope
import sg.toru.multimoduledagger.di.module.ShopModule
import sg.toru.multimoduledagger.ui.activity.MainActivity

@PerActivityScope
@Subcomponent(modules = [ShopModule::class])
interface ShopComponent {
    fun inject(activity: MainActivity)
}