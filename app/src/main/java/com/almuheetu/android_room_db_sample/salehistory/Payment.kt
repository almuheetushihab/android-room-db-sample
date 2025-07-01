package com.almuheetu.android_room_db_sample.salehistory

data class Payment(
    val amount: String,
    val amount_refunded: String,
    val captured_amount: String,
    val completed_at: Any,
    val currency_code: String,
    val failure_code: Any,
    val failure_message: Any,
    val id: Int,
    val initiated_at: String,
    val meta_data: List<MetaDataXX>,
    val order_number: String,
    val payment_id: String,
    val payment_intent: String,
    val status: String
)