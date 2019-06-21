package com.glureau.appb

import android.app.Activity

interface AppBInjectorProvider {
    fun appBInjector(): AppBInjector
}

fun Activity.appBInjector() = (this.application as AppBInjectorProvider?)?.appBInjector()
    ?: error("Cannot inject without a proper reference to the application")

interface AppBInjector {
    fun inject(mainActivityB: MainActivityB)
}