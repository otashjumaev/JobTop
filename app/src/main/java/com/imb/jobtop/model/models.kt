package com.imb.jobtop.model

import android.graphics.Bitmap

data class Job(
    var id: Long,
    var title: String,
    var employer: String,
    var info: String,
    var salary: String,
    var isFavorite: Boolean,
    var location: String,
    var time: Long,
    var requirements: List<String>
)

data class JobMinimal(
    var id: Long,
    var title: String,
    var employer: String,
    var salary: String,
    var isFavorite: Boolean,
    var location: String,
    var time: Long,
)

data class Category(
    var id: Long,
    var icon: Bitmap,
    var title: String,
    var jobCount: Int,
)