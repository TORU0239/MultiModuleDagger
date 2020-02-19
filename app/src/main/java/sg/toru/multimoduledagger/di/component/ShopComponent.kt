package sg.toru.multimoduledagger.di.component

import dagger.Subcomponent
import sg.toru.multimoduledagger.di.PerActivityScope
import sg.toru.multimoduledagger.ui.MainActivity

@PerActivityScope
@Subcomponent
interface ShopComponent {
    fun inject(activity: MainActivity)
}