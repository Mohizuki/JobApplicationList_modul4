package com.example.juliapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class homeDataModel (

    @StringRes val DescriptionResId: Int,
    @StringRes val NameResId: Int,
    @StringRes val SexResId: Int,
    @StringRes val AgeResId: Int,
    @DrawableRes val ImageResId: Int
    )