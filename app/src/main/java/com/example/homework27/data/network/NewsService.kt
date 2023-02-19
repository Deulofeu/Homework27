package com.example.homework27.data.network

import com.example.homework27.data.model.NewsListArticleResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsService {

    @Headers("x-api-key: 0718d6f5fbe545cc9ac7f9c55e9a1522")
    @GET("everything")
    fun getNews (@Query("q") q: String): Call<NewsListArticleResponse>
}