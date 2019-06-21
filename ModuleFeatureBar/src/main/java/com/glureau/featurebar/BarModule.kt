package com.glureau.featurebar

import com.glureau.modulebase.BaseService

interface BarModule {
    fun providesBaseService(): BaseService
}