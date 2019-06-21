package com.glureau.featurebar

import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FeatureBarService @Inject constructor(private val baseService: BaseService) {
    fun getBar() = "BAR: " + baseService.hello()
}