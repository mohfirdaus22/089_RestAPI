package com.example.consumerestapi.network

import com.example.consumerestapi.model.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface KontakService {
    @Headers(
        "Accept: application/json"
    )
    @GET("kontak")
    suspend fun getKontak(): List<Kontak>

    @GET("kontak/{id}")
    suspend fun getKontakById(@Path("id")id: Int):Kontak



}