package com.example.lesson5_3
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class   RetrofitServise {
         companion object{
            val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com").
            addConverterFactory(GsonConverterFactory.create()).build()

            var api = retrofit.create(PixaApi::class.java)
        }
    }
