package com.example.homework27.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework27.domain.NewsData
import com.example.homework27.domain.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val repository: NewsRepository,
) : ViewModel() {

    private val _liveData = MutableLiveData<List<NewsData>>()
    val liveData: LiveData<List<NewsData>> get() = _liveData

    private val _loadingLiveData = MutableLiveData<Boolean>()
    val loadingLiveData: LiveData<Boolean> get() = _loadingLiveData


    fun getNews() {
        _loadingLiveData.value = true
        viewModelScope.launch() {
            val newsList = repository.getNews()
            _liveData.value = newsList
            _loadingLiveData.value = false
        }
    }
}