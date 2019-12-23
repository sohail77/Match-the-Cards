package com.example.matchthecards.api

import com.example.matchthecards.model.Products
import com.example.matchthecards.model.ProductsObject
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit


var okHttpClient = OkHttpClient.Builder()
    .readTimeout(5, TimeUnit.MINUTES)
    .connectTimeout(5, TimeUnit.MINUTES)
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .client(okHttpClient)
    .build()

interface ApiService {
    @GET(URL_EXTRAS)
    fun getProducts() : Call<ProductsObject>
}

object ProductApi {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}

