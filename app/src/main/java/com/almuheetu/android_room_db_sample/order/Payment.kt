package com.almuheetu.android_room_db_sample.order

data class Payment(
    val intent: String,
    val meta_data: List<MetaDataX>,
    val status: String
)