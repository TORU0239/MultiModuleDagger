package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.Bread
import sg.toru.multimoduledagger.lib.HotDog
import sg.toru.multimoduledagger.lib.Sausage
import javax.inject.Singleton

@Module
class HotDogModule {

    @Provides
    @Singleton
    fun sausage() = Sausage()

    @Provides
    @Singleton
    fun bread() = Bread()

    @Provides
    @Singleton
    fun hotDog(bread: Bread, sausage: Sausage) = HotDog(bread, sausage)
}