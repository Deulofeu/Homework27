package com.example.homework27.data.model

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("title") val title: String? = null,
    @SerializedName("url") val url: String? = null,
    @SerializedName("author") val author: String? = null,
    @SerializedName("urlToImage") val urlToImage: String? = null
)