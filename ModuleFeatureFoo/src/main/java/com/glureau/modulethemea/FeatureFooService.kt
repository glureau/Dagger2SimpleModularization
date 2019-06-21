package com.glureau.modulethemea

import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FeatureFooService @Inject constructor(private val baseService: BaseService) {
    fun getFoo() = "Foo: " + baseService.hello()
}