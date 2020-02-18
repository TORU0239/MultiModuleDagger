package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.DependencyA
import sg.toru.multimoduledagger.lib.DependencyB
import javax.inject.Singleton

@Module
class SecondModule {
    @Singleton
    @Provides
    fun dependencyB() = DependencyB()
}