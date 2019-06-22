package com.glureau.appa

import com.glureau.featurefoo.FooBaseService
import com.glureau.featurefoo.FooModule
import com.glureau.modulebase.BaseService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule : FooModule {
    @Provides
    @Singleton
    override fun providesBaseService(): BaseService = FooBaseService()
}