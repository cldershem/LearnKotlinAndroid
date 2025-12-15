package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes var title: Int,
    var number: Int,
    @DrawableRes var image: Int,
)