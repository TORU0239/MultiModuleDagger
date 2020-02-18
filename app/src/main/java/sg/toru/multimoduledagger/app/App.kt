package sg.toru.multimoduledagger.app

import android.app.Application
import sg.toru.multimoduledagger.di.component.AppComponent
import sg.toru.multimoduledagger.di.component.DaggerAppComponent

class App: Application() {

    lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
    }
}