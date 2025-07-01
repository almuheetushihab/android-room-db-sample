package com.almuheetu.android_room_db_sample.salehistory

data class Branch(
    val address: String,
    val coordinates: Any,
    val created_at: String,
    val id: Int,
    val is_active: Boolean,
    val name: String,
    val updated_at: String
)