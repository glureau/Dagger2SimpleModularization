package com.glureau.featurefoo

import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FooBaseService @Inject constructor() : BaseService {
    override fun hello() = "I'm BaseServiceImpl"
}
