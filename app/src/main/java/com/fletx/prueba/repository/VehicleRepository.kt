package com.fletx.pruebA.repository

import android.util.Log
import com.fletx.pruebA.data.model.Vehicle
import com.fletx.pruebA.data.network.ApiService
import javax.inject.Inject

class VehicleRepository @Inject constructor(
    private  val api: ApiService
){
    suspend fun getDataFromApi(): List<Vehicle> {
        val response:List<Vehicle> =api.getData()
        return response
    }

}