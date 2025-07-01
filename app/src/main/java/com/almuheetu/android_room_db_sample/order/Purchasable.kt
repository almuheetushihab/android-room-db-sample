package com.almuheetu.android_room_db_sample.order

data class Purchasable(
    val bogo_discount_id: Any,
    val discount_should_apply: Boolean,
    val id: Int,
    val meta_data: MetaDataXX,
    val quantity: Int,
    val random_item_discount_id: Any
)