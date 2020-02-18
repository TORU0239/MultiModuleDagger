package sg.toru.multimoduledagger.di.component

import dagger.Component
import sg.toru.multimoduledagger.di.module.HamburgerModule
import sg.toru.multimoduledagger.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [HamburgerModule::class])
interface AppComponent {
    fun inject(activity:MainActivity)
}