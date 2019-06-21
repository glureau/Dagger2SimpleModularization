package com.glureau.appb

import com.glureau.featurebar.BarBaseService
import com.glureau.featurebar.BarModule
import com.glureau.featurefoo.FooModule
import com.glureau.modulebase.BaseService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule : BarModule, FooModule {
    @Provides
    @Singleton
    override fun providesBaseService(): BaseService = BarBaseService()
}