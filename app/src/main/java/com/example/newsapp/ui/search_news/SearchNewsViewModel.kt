package com.example.newsapp.ui.search_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchNewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Search News Fragment"
    }
    val text: LiveData<String> = _text
}