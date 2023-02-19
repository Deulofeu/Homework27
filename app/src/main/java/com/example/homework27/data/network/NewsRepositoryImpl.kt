package com.example.homework27.data.network

import com.example.homework27.data.mapper.NewsMapper
import com.example.homework27.domain.NewsData
import com.example.homework27.domain.NewsRepository
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val service: NewsService,
    private val mapper: NewsMapper,

    ) : NewsRepository {

    override suspend fun getNews(): List<NewsData> {
        return withContext(Dispatchers.IO) {
            service.getNews("bbc-news").execute().body()?.articles?.map { mapper(it) }
                ?: throw Exception()
        }
    }
}

