package com.glureau.featurefoo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_foo.*
import javax.inject.Inject

class FooFragment : Fragment() {
    companion object {
        fun newInstance() = FooFragment()
    }

    @Inject
    lateinit var featureFooService: FeatureFooService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fooInjector().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_foo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_view.text = "Fragment ${featureFooService.getFoo()}"
    }

}
