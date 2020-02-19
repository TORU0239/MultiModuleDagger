package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.di.PerActivityScope
import sg.toru.multimoduledagger.lib.Hamburger
import sg.toru.multimoduledagger.lib.HotDog
import sg.toru.multimoduledagger.lib.Shop

@Module
class ShopModule {
    @Provides
    @PerActivityScope
    fun shop(hamburger: Hamburger, hotdog:HotDog) = Shop(hamburger, hotdog)
}
