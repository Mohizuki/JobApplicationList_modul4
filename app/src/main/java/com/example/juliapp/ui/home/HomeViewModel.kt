package com.example.juliapp.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.juliapp.R
import com.example.juliapp.model.homeDataModel

class HomeViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name
    private val _sex = MutableLiveData<String>()
    val sex: LiveData<String> = _sex
    private val _age = MutableLiveData<String>()
    val age: LiveData<String> = _age
    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<homeDataModel> {
        return listOf(
            homeDataModel(

                R.string.desc1,
                R.string.name1,
                R.string.sex2,
                R.string.age1,
                R.drawable.p1
            ),
            homeDataModel(

                R.string.desc2,
                R.string.name2,
                R.string.sex2,
                R.string.age3,
                R.drawable.p2
            ),
            homeDataModel(
                R.string.desc3,
                R.string.name3,
                R.string.sex2,
                R.string.age3,
                R.drawable.p3
            ),
            homeDataModel(
                R.string.desc4,
                R.string.name4,
                R.string.sex1,
                R.string.age1,
                R.drawable.p4
            ),
            homeDataModel(
                R.string.desc5,
                R.string.name5,
                R.string.sex2,
                R.string.age2,
                R.drawable.p5
            ),
            homeDataModel(
                R.string.desc6,
                R.string.name6,
                R.string.sex1,
                R.string.age1,
                R.drawable.p6
            ),
            homeDataModel(
                R.string.desc7,
                R.string.name7,
                R.string.sex2,
                R.string.age2,
                R.drawable.p7
            ),
            homeDataModel(
                R.string.desc8,
                R.string.name8,
                R.string.sex1,
                R.string.age1,
                R.drawable.p8
            ),
            homeDataModel(
                R.string.desc9,
                R.string.name9,
                R.string.sex2,
                R.string.age3,
                R.drawable.p9
            ),
            homeDataModel(
                R.string.desc1,
                R.string.name1,
                R.string.sex2,
                R.string.age3,
                R.drawable.p1
            )
        )
    }

    fun setData(data: homeDataModel, context: Context) {
        _name.value = context.getString(data.NameResId)
        _sex.value = context.getString(data.SexResId)
        _age.value = context.getString(data.AgeResId)
        _image.value = data.ImageResId
        _desc.value = context.getString(data.DescriptionResId)
    }
}