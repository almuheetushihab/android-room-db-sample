package com.almuheetu.android_room_db_sample.salehistory

data class Item(
    val currency_code: String,
    val description: String,
    val discount_total: String,
    val id: Int,
    val meta_data: MetaData,
    val order_number: String,
    val purchasable: Purchasable,
    val quantity: Int,
    val refunded: Boolean,
    val subtotal: String,
    val tax_total: String,
    val total_price: String,
    val unit_price: String
)