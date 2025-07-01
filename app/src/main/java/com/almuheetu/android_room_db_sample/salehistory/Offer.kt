package com.almuheetu.android_room_db_sample.salehistory

data class Offer(
    val item_ids: List<Int>,
    val max_reward_quantity: Int,
    val purchase_quantity: Int,
    val reward_item_ids: List<Int>,
    val reward_quantity: Int
)