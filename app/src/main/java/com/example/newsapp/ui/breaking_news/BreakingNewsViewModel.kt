package com.example.newsapp.ui.breaking_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BreakingNewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Breaking News Fragment"
    }
    val text: LiveData<String> = _text
}