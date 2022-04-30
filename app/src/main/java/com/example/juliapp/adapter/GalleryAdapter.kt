package com.example.juliapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.juliapp.R
import com.example.juliapp.model.galleryDataModel
import com.example.juliapp.ui.gallery.GalleryDetailActivity
import com.example.juliapp.ui.gallery.GalleryViewModel

class GalleryAdapter(
    private val context: Context,
    private val dataset: List<galleryDataModel>
) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    private val viewModel = GalleryViewModel()


    class GalleryViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_gallery_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gallery_item, parent, false)
        return GalleryViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.ImageResId)

        holder.view.setOnClickListener {
            viewModel.setData(item)
            val intent = Intent(context, GalleryDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size


}