package com.glureau.appa

import com.glureau.featurefoo.FooInjector
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponentA : AppAInjector, FooInjector