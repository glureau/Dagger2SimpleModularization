package com.glureau.modulecommon

import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FeatureCommonService @Inject constructor(private val baseService: BaseService) : BaseService by baseService {
    override fun hello() =
        "I'm FeatureCommon and use internally a BaseService: '${baseService.hello()}'"
}