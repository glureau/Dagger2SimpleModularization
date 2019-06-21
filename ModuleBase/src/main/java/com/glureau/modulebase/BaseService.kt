package com.glureau.modulebase

import javax.inject.Inject

interface BaseService {
    fun hello(): String
}

class BaseServiceImpl @Inject constructor() : BaseService {
    override fun hello() = "I'm BaseService"
}
