package com.almuheetu.android_room_db_sample.salehistory

data class MetaDataX(
    val additional_amount_breakdown: List<AdditionalAmountBreakdown>,
    val customer: CustomerX,
    val device_info: DeviceInfo,
    val discount_breakdown: List<DiscountBreakdown>,
    val loyalty_point: LoyaltyPoint
)