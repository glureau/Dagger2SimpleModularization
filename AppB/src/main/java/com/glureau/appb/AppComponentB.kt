package com.glureau.appb

import com.glureau.featurebar.BarInjector
import com.glureau.featurefoo.FooInjector
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponentB : AppBInjector, FooInjector, BarInjector