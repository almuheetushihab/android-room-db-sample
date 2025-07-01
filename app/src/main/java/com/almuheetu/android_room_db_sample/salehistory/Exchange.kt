package com.almuheetu.android_room_db_sample.salehistory

data class Exchange(
    val allow_backorder: Boolean,
    val difference_due: String,
    val exchange_quantity: Int,
    val id: Int,
    val order_number: String,
    val order_return: OrderReturn,
    val total_exchange_amount: String
)