package com.glureau.modulethemeb

import android.text.SpannableString
import com.glureau.modulebase.BaseService
import javax.inject.Inject

class FeatureBarService @Inject constructor(private val baseService: BaseService) {
    fun getBar() = SpannableString("BAR: " + baseService.hello())
}