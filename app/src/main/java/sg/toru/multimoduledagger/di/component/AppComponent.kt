package sg.toru.multimoduledagger.di.component

import dagger.Component
import sg.toru.multimoduledagger.di.module.HamburgerModule
import sg.toru.multimoduledagger.di.module.HardwareShopModule
import sg.toru.multimoduledagger.di.module.HotDogModule
import javax.inject.Singleton

@Singleton
@Component(modules = [HamburgerModule::class, HotDogModule::class, HardwareShopModule::class])
interface AppComponent {
    fun shopComponent():ShopComponent
    fun hardwareShopComponent():HardwareShopComponent
}