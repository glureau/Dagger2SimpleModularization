package com.glureau.featurefoo

import androidx.fragment.app.Fragment

interface FooInjectorProvider {
    fun fooInjector(): FooInjector
}

fun Fragment.fooInjector() = (this.activity?.application as FooInjectorProvider?)?.fooInjector()
    ?: error("Cannot inject without a proper reference to the application")

interface FooInjector {
    fun inject(fragment: FooFragment)
}