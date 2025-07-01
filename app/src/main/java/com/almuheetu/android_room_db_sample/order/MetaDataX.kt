package com.almuheetu.android_room_db_sample.order

data class MetaDataX(
    val amount: String,
    val amount_change: Int,
    val card_type: String,
    val payment_information: String,
    val provider: String,
    val type: String,
    val vouchers: List<Any>
)