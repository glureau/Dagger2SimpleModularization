package com.glureau.appa

import android.app.Application
import com.glureau.featurefoo.FooInjectorProvider

class ApplicationA : Application(), FooInjectorProvider, AppAInjectorProvider {

    private val appComponent = DaggerAppComponentA.builder().build()!!

    override fun fooInjector() = appComponent
    override fun appAInjector() = appComponent
}