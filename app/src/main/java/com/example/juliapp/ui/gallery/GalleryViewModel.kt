package com.example.juliapp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.juliapp.R
import com.example.juliapp.model.galleryDataModel

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<galleryDataModel> {
        return listOf(
            galleryDataModel(R.drawable.p1),
            galleryDataModel(R.drawable.p2),
            galleryDataModel(R.drawable.p3),
            galleryDataModel(R.drawable.p4),
            galleryDataModel(R.drawable.p5),
            galleryDataModel(R.drawable.p6),
            galleryDataModel(R.drawable.p7),
            galleryDataModel(R.drawable.p8),
            galleryDataModel(R.drawable.p9),
            galleryDataModel(R.drawable.p1),
        )
    }

    fun setData(data: galleryDataModel) {
        _image.value = data.ImageResId
    }
}