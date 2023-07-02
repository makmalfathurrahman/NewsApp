package com.example.newsapp.ui.article_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArticleNewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Article News"
    }
    val text: LiveData<String> = _text

}