package sg.toru.multimoduledagger.lib

import android.util.Log
import javax.inject.Inject

class Hamburger @Inject constructor(patty:Patty, bun:Bun) {

    fun test() {
        Log.e("Toru", "Hamburger!!!")
    }

}

class Bun {

}

class Patty {

}
