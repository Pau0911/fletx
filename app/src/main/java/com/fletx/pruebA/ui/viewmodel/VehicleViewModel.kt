package com.fletx.pruebA.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fletx.pruebA.data.model.Vehicle
import com.fletx.pruebA.repository.VehicleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VehicleViewModel @Inject constructor(private val repository: VehicleRepository):ViewModel() {

    val vehicles= MutableLiveData<List<Vehicle>>()
    val isLoading= MutableLiveData<Boolean>()

    fun onCreate(){
       viewModelScope.launch {
            isLoading.postValue(true)
            val response= repository.getDataFromApi()
            if(response.size !=0){
                vehicles.postValue(response)
                isLoading.postValue(false)
            }
        }
    }

}