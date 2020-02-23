package sg.toru.multimoduledagger.di.module

import dagger.Module
import dagger.Provides
import sg.toru.multimoduledagger.lib.Hammer
import sg.toru.multimoduledagger.lib.ScrewDriver

@Module
class HardwareShopModule {

    @Provides
    fun hammer() = Hammer()

    @Provides
    fun screwDriver() = ScrewDriver()
}