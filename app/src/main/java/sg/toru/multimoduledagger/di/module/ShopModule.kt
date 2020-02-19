package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.Hamburger
import sg.toru.multimoduledagger.lib.HotDog
import sg.toru.multimoduledagger.lib.Shop
import javax.inject.Singleton

@Module
class ShopModule {
    @Provides
    @Singleton
    fun shop(hamburger: Hamburger, hotdog:HotDog) = Shop(hamburger, hotdog)
}
