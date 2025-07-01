package com.almuheetu.android_room_db_sample.salehistory

data class MetaData(
    val attributes: List<Attribute>,
    val discount: Discount,
    val is_rewarded: Boolean,
    val sku: String
)