package com.example.movie.ui

import com.google.gson.annotations.SerializedName

class MainActivity {
    data class ApiResponse(
        @SerializedName("Search")
        val dataList: List<MainData>?
    )

    data class MainData(
        @SerializedName("Title")
        val title: String,

        @SerializedName("Poster")
        val poster: String
    )
}