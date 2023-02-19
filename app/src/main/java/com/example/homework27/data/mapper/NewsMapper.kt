package com.example.homework27.data.mapper

import com.example.homework27.data.model.NewsResponse
import com.example.homework27.domain.NewsData
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    operator fun invoke(response: NewsResponse): NewsData = with(response) {
        return NewsData(
            url = url.orEmpty(),
            author = author.orEmpty(),
            title = title.orEmpty(),
            urlToImage = urlToImage.orEmpty()
        )
    }
}