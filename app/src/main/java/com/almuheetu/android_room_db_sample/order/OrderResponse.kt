package com.almuheetu.android_room_db_sample.order

data class OrderResponse(
    val amount_change: Int,
    val amount_due: Int,
    val amount_paid: Int,
    val branch_id: Int,
    val channel_id: Int,
    val customer_id: Int,
    val meta_data: MetaData,
    val payment: Payment,
    val purchasable: List<Purchasable>,
    val register_id: Int,
    val sales_tracking_number: Any
)