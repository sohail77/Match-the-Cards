package com.example.matchthecards.model

/**
 * This model class is used to get the data from the api.
 * It represents each product.
 */
data class Products(
    var id: String,
    var title: String,
    var image: ProductImage,
    var isMatched: Boolean
)