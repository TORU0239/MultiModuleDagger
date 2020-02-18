package sg.toru.multimoduledagger.lib

import android.util.Log

class DependencyA {
    fun returnsA() {
        Log.e("DependencyA", "returnsA")
    }
}