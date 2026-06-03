package com.example.labubu_apps.Data.Api

import com.example.labubu_apps.Data.Model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}