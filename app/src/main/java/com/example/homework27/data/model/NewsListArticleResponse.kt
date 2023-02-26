package com.example.homework27.data.model

import com.google.gson.annotations.SerializedName

data class NewsListArticleResponse(
    @SerializedName("articles") val articles: List<NewsResponse>? = null
)