package com.example.matchthecards.model

import com.google.gson.annotations.SerializedName

data class ProductImage(
    val id: String,
    @SerializedName("src")
    val url: String
)