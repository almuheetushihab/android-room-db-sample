package com.almuheetu.android_room_db_sample.salehistory

data class SaleHistoryResponse(
    val `data`: List<Data>,
    val links: Links,
    val message: String,
    val meta: Meta,
    val status: String
)