package sg.toru.multimoduledagger.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import sg.toru.multimoduledagger.R
import sg.toru.multimoduledagger.lib.Hammer
import sg.toru.multimoduledagger.lib.ScrewDriver
import sg.toru.multimoduledagger.ui.activity.SecondActivity
import javax.inject.Inject

class SecondFragment : Fragment(R.layout.fragment_second) {

    @Inject
    lateinit var hammer:Hammer

    @Inject
    lateinit var screwDriver: ScrewDriver

    override fun onAttach(context: Context) {
        super.onAttach(context)
        initializeDependencyInjection()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Toru", "SecondFragment, hammer:: ${hammer.name()}, screwDriver: ${screwDriver.name()}")

    }

    private fun initializeDependencyInjection() {
        (activity as SecondActivity).hardwareShopComponent.inject(this)
    }

    companion object {
        fun instance() = SecondFragment()
    }
}
