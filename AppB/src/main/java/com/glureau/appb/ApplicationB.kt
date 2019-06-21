package com.glureau.appb

import android.app.Application
import com.glureau.featurebar.BarInjectorProvider
import com.glureau.featurefoo.FooInjectorProvider

class ApplicationB : Application(), BarInjectorProvider, FooInjectorProvider, AppBInjectorProvider {

    private val appComponent = DaggerAppComponentB.builder().build()!!

    override fun barInjector() = appComponent
    override fun fooInjector() = appComponent
    override fun appBInjector() = appComponent
}