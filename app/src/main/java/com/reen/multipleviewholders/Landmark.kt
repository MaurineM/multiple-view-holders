package com.reen.multipleviewholders

data class Landmark(
    val title: String,
    val desc: String,
    var resource: Int?,
    val hasImage: HasImage
)
