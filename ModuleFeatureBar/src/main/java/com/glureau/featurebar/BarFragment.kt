package com.glureau.featurebar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_bar.*
import javax.inject.Inject

class BarFragment : Fragment() {
    companion object {
        fun newInstance() = BarFragment()
    }

    @Inject
    lateinit var featureBarService: FeatureBarService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        barInjector().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_view.text = "Fragment ${featureBarService.getBar()}"
    }

}
