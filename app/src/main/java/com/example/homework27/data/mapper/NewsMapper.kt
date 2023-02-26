package com.example.homework27.data.mapper

import com.example.homework27.data.model.NewsResponse
import com.example.homework27.domain.NewsData
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    operator fun invoke(response: NewsResponse): NewsData = with(response) {
        return NewsData(
            title = title.orEmpty(),
            url = url.orEmpty(),
            author = author.orEmpty(),
            urlToImage = urlToImage.orEmpty()
        )
    }
}