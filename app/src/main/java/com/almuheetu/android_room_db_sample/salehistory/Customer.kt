package com.almuheetu.android_room_db_sample.salehistory

data class Customer(
    val company_name: Any,
    val customer_code: Any,
    val customer_group_id: Int,
    val dob: Any,
    val email: Any,
    val first_name: String,
    val full_name: String,
    val gender: Any,
    val id: Int,
    val last_name: String,
    val latest_sale_at: Any,
    val orders_count: Int,
    val orders_sum_total: Int,
    val phone: String
)