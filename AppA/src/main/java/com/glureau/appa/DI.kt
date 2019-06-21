package com.glureau.appa

import androidx.fragment.app.Fragment

interface AppAInjectorProvider {
    fun appAInjector(): AppAInjector
}

fun Fragment.appAInjector() = (this.activity?.application as AppAInjectorProvider?)?.appAInjector()
    ?: error("Cannot inject without a proper reference to the application")

interface AppAInjector {
    fun inject(mainActivityA: MainActivityA)
}