package com.glureau.featurebar

import androidx.fragment.app.Fragment

interface BarInjectorProvider {
    fun barInjector(): BarInjector
}

fun Fragment.barInjector() = (this.activity?.application as BarInjectorProvider?)?.barInjector()
    ?: error("Cannot inject without a proper reference to the application")

interface BarInjector {
    fun inject(fragment: BarFragment)
}