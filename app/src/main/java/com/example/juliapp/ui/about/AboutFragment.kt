package com.example.juliapp.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.juliapp.R
import com.example.juliapp.adapter.GalleryAdapter
import com.example.juliapp.databinding.FragmentGalleryBinding
import com.example.juliapp.ui.gallery.GalleryViewModel

class AboutFragment : Fragment(R.layout.fragment_nav_about) {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val view: View = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.galleryRecyclerView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}