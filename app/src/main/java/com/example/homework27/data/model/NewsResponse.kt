package com.example.homework27.data.model

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("url") val url: String? = null,
    @SerializedName("author") val author: String? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("urlImage") val urlToImage: String? = null
)