package com.glureau.featurefoo

import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FeatureFooService @Inject constructor(private val baseService: BaseService) {
    fun getFoo() = "FOO: " + baseService.hello()
}