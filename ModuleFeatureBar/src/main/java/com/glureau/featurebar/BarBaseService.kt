package com.glureau.featurebar

import com.glureau.modulebase.BaseService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BarBaseService @Inject constructor() : BaseService {
    override fun hello() = "I'm BarBaseService"
}