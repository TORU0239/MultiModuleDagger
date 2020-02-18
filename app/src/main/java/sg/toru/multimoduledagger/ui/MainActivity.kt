package sg.toru.multimoduledagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.di.component.DaggerAppComponent
import sg.toru.multimoduledagger.di.module.FirstModule
//import sg.toru.multimoduledagger.di.module.FirstModule
import sg.toru.multimoduledagger.di.module.SecondModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    private lateinit var component: AppComponent

    @Inject
    lateinit var moduleA: FirstModule
    @Inject
    lateinit var moduleB:SecondModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDependencyInjection()
        setContentView(R.layout.activity_main)

//        init()
    }

    private fun init() {
//        moduleA.dependencyA()
//        moduleB.dependencyB()
    }


    private fun initDependencyInjection() {

        DaggerAppComponent.builder()
            .firstModule(FirstModule())
            .secondModule(SecondModule())
            .build().inject(this)

    }
}