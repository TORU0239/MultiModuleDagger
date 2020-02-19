package sg.toru.multimoduledagger.di.component

import dagger.Component
import sg.toru.multimoduledagger.di.module.HamburgerModule
import sg.toru.multimoduledagger.di.module.HotDogModule
import sg.toru.multimoduledagger.di.module.ShopModule
import sg.toru.multimoduledagger.lib.Shop
import sg.toru.multimoduledagger.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [HamburgerModule::class, HotDogModule::class, ShopModule::class])
interface AppComponent {
    fun shopComponent():ShopComponent
}