package sg.toru.multimoduledagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(private val id:Int):AppCompatActivity(id) {

    override fun onCreate(savedInstanceState: Bundle?) {
        initDependencyInjection()
        super.onCreate(savedInstanceState)
    }
    abstract fun initDependencyInjection()
}