package com.almuheetu.android_room_db_sample.order

data class MetaData(
    val customer: Any,
    val discount_breakdown: List<DiscountBreakdown>
)