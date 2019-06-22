package com.glureau.appa

import android.app.Activity

interface AppAInjectorProvider {
    fun appAInjector(): AppAInjector
}

fun Activity.appAInjector() = (this.application as AppAInjectorProvider?)?.appAInjector()
    ?: error("Cannot inject without a proper reference to the application")

interface AppAInjector {
    fun inject(mainActivityA: MainActivityA)
}