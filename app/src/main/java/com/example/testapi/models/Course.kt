package com.example.testapi.models

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("background_color_precent")
    val backgroundColorPrecent: String,
    val color: String,
    val image: String,
    val precent: String,
    val title: String
)