package com.example.newsapp.ui.bookmark_news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.databinding.FragmentBookmarkNewsBinding

class BookmarkNewsFragment : Fragment() {

    private var _binding : FragmentBookmarkNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bookmarkNewsViewModel =
            ViewModelProvider(this).get(BookmarkNewsViewModel::class.java)

        _binding = FragmentBookmarkNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBookmarkNews
        bookmarkNewsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}