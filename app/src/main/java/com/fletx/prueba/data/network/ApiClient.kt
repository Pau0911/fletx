package com.fletx.pruebA.data.network

import com.fletx.pruebA.data.model.ResponseApi
import retrofit2.Response
import retrofit2.http.GET

interface  ApiClient {


    @GET("/people/holder_vehicles/2282.json")
    suspend fun getVehicles(): Response<ResponseApi>


}