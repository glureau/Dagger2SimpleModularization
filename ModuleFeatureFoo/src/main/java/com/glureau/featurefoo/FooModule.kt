package com.glureau.featurefoo

import com.glureau.modulebase.BaseService

interface FooModule {
    fun providesBaseService(): BaseService
}