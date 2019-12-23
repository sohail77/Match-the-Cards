package com.example.matchthecards.model

data class Products(
    var id: String,
    var title: String,
    var image: ProductImage,
    var isMatched: Boolean
)