package com.almuheetu.android_room_db_sample.salehistory

data class MetaDataXX(
    val amount: String,
    val amount_change: Int,
    val card_type: String,
    val payment_information: String,
    val provider: String,
    val type: String,
    val vouchers: List<String>
)