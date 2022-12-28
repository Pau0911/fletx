package com.fletx.pruebA.data.model


data class ResponseApi (
    val success:Boolean,
    val message: String,
    val data: List<Vehicle>
)