package com.teller.tellapp.data

data class Trans(
//    var accountId: Long,
    var amount: Double,
//    var isCompleted: Boolean,
    var date: String,
    val id: Long,
//    var imageData: String,
    var transactionId: String,
    var transactionType: String
)
