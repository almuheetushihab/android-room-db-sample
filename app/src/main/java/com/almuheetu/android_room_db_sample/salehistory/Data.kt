package com.almuheetu.android_room_db_sample.salehistory

data class Data(
    val amount_change: String,
    val amount_due: String,
    val amount_paid: String,
    val amount_refund: String,
    val branch: Branch,
    val currency_code: String,
    val customer: Customer,
    val discount_total: String,
    val exchange: Exchange,
    val full_paid: Boolean,
    val id: Int,
    val items: List<Item>,
    val meta_data: MetaDataX,
    val order_number: String,
    val payment: Payment,
    val payment_status: String,
    val sale_at: String,
    val seller: Seller,
    val status: String,
    val subtotal: String,
    val tax_total: String,
    val total: String,
    val total_excluding_tax: String,
    val updated_at: String
)