package com.example.newsapp.ui.bookmark_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookmarkNewsViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Bookmark News fragment"
    }
    val text: LiveData<String> = _text

}