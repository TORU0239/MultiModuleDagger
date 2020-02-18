package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.DependencyA
import javax.inject.Singleton

@Module
class FirstModule {
    @Singleton
    @Provides
    fun dependencyA() = DependencyA()
}