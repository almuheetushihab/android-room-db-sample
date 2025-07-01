package com.almuheetu.android_room_db_sample.salehistory

data class OrderReturn(
    val canceled: Any,
    val currency_code: String,
    val damaged_quantity: Int,
    val id: Int,
    val notes: String,
    val order_number: String,
    val quantity: Int,
    val received: Boolean,
    val restock_fee: String,
    val return_total: String,
    val shipment_total: String,
    val status: String,
    val tracking_code: Any
)