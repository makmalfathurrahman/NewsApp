package com.example.newsapp.ui.breaking_news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.databinding.FragmentBreakingNewsBinding

class BreakingNewsFragment : Fragment() {

    private var _binding: FragmentBreakingNewsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val breakingNewsViewModel =
            ViewModelProvider(this).get(BreakingNewsViewModel::class.java)

        _binding = FragmentBreakingNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBreakingNews
        breakingNewsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}