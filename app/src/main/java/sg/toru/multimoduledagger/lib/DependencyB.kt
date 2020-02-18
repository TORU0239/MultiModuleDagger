package sg.toru.multimoduledagger.lib

import android.util.Log

class DependencyB {
    fun returnsB() {
        Log.e("DependencyB", "returnsB")
    }
}