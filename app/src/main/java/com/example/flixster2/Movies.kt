package com.example.flixster2

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("page")
    val response: BaseResponse?
)
@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val docs: List<Movie>?
)
@Keep
@Serializable
data class Movie(
    @SerialName("overview")
    val overview: String?,
    @SerialName("release_date")
    val date: String?,
    @SerialName("vote_average")
    val review: String?,
    @SerialName("original_title")
    val title: String?,
    @SerialName("poster_path")
    val partial:String?,

    val img: String = "https://image.tmdb.org/t/p/w500/$partial"
): java.io.Serializable