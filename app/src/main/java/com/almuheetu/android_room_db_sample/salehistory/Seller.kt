package com.almuheetu.android_room_db_sample.salehistory

data class Seller(
    val address: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val is_active: Boolean,
    val last_name: Any,
    val phone: String
)