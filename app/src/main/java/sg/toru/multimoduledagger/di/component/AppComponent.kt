package sg.toru.multimoduledagger.di.component

import dagger.Component
import sg.toru.multimoduledagger.di.module.FirstModule
import sg.toru.multimoduledagger.di.module.SecondModule
import sg.toru.multimoduledagger.ui.MainActivity
import javax.inject.Singleton

//@Singleton
@Component(modules = [FirstModule::class, SecondModule::class])
interface AppComponent {
    fun inject(activity:MainActivity)
}