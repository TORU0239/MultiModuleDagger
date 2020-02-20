package sg.toru.multimoduledagger.lib

import android.util.Log
import javax.inject.Inject

class Hamburger @Inject constructor(
    private val patty:Patty,
    private val bun:Bun
) {

    fun test() {
        Log.e("Toru", "Hamburger!!!")
    }

    fun name() {
        Log.e("Toru", "This is Five guys Hamburger!!!")
    }

    fun ingredient() = "we make with ${bun.bunName}, ${patty.meat}!!"
}

class Bun {
    val bunName:String = "Wheat"
}

class Patty {
    val meat:String = "Pure Beef"
}