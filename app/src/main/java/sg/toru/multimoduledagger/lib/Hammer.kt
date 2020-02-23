package sg.toru.multimoduledagger.lib

import sg.toru.multimoduledagger.di.PerActivityScope
import javax.inject.Inject

@PerActivityScope
class Hammer @Inject constructor() {
    fun name() = "Hammer!!!"
}
