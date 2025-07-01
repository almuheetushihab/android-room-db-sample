package com.almuheetu.android_room_db_sample.salehistory

data class DiscountX(
    val discount_id: Int,
    val ends_at: String,
    val item_id: Int,
    val starts_at: String,
    val type: String,
    val usage_count: Int,
    val usage_limit: Any,
    val value: Int
)