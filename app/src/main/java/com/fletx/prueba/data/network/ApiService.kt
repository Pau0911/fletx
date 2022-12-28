package com.fletx.pruebA.data.network

import android.util.Log
import com.fletx.pruebA.data.model.Vehicle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ApiService @Inject constructor(private  val api:ApiClient) {

    suspend fun getData():List<Vehicle>{
        return withContext(Dispatchers.IO){
            val response = api.getVehicles()
            response.body()?.data ?: emptyList()
        }
    }

}