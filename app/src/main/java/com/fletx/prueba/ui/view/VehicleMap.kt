package com.fletx.pruebA.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.fletx.pruebA.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class VehicleMap : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    lateinit var ubicacion: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        ubicacion = intent.getStringExtra("ubicacion").toString()

    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-74.2690526,4.7434159 )
        mMap.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker del vehiculo")
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }


}