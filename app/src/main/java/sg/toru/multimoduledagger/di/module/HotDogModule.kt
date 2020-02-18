package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.HotDog
import javax.inject.Singleton

@Module
class HotDogModule {
    @Provides
    @Singleton
    fun hotDog() = HotDog()
}