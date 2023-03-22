package com.ncrdesarrollo.apinasa.home

data class InfoHomeData(
    var icon: Int,
    var title: String,
    var subtitle: String,
    val enum: OptionsMenu,
    val isSection: Boolean = false
)
