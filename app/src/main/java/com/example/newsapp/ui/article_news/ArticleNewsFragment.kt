package com.example.newsapp.ui.article_news

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentArticleNewsBinding

class ArticleNewsFragment : Fragment() {

    private var _binding: FragmentArticleNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val articleNewsViewModel =
            ViewModelProvider(this).get(ArticleNewsViewModel::class.java)

        _binding = FragmentArticleNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textArticleNews
        articleNewsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}