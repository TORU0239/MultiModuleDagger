package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.Bun
import sg.toru.multimoduledagger.lib.Hamburger
import sg.toru.multimoduledagger.lib.Patty
import javax.inject.Singleton

@Module
class HamburgerModule {

    @Provides
    @Singleton
    fun patty() = Patty()

    @Provides
    @Singleton
    fun bun() = Bun()

    @Provides
    @Singleton
    fun burger(patty:Patty, bun:Bun) = Hamburger(patty, bun)
}