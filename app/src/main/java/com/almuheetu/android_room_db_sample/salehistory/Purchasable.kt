package com.almuheetu.android_room_db_sample.salehistory

data class Purchasable(
    val backorder: Int,
    val discount: DiscountX,
    val discount_amount: String,
    val discount_price: String,
    val ean: Any,
    val gtin: Any,
    val id: Int,
    val meta_data: List<Any?>,
    val mpn: Any,
    val option_values: Any,
    val sku: String,
    val total_stock_count: Int,
    val unit_quantity: Int
)