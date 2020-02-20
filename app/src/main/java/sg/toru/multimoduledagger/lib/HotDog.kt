package sg.toru.multimoduledagger.lib

import android.util.Log
import javax.inject.Inject

class HotDog @Inject constructor(
    private val bun:Bread,
    private val sausage:Sausage
) {
    fun hotDog() {
        Log.e("Toru", "hotDog!!!!")
    }

    fun ingredient() = "we make with ${bun.bunName}, ${sausage.meat}!!"
}

class Sausage {
    val meat:String = "Pork Sausage"
}

class Bread {
    val bunName:String = "Wheat"
}