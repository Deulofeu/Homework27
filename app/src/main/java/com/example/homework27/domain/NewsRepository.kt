package com.example.homework27.domain

interface NewsRepository {

    suspend fun getNews(): List<NewsData>
}