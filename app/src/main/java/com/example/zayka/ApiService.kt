package com.example.zayka

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


//makes connection to base url and convert in format into objects in kotlin
private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/").addConverterFactory(GsonConverterFactory.create())
    .build()

//create method help to gain access to service method
val recipeService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("categories.php") // to get http request
    suspend fun  getCategories(): CategoriesResponse
}