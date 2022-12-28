package com.fletx.pruebA.ui.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.fletx.pruebA.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlin.properties.Delegates


class VehicleMap : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var ubicacion: String
    private var longitude by Delegates.notNull<Double>()
    private var latitude by Delegates.notNull<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        ubicacion = intent.getStringExtra("ubicacion").toString()

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        getLocation()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val lugar = LatLng(latitude, longitude)
        mMap.addMarker(
            MarkerOptions()
                .position(lugar)
                .visible(true)
                .title("Ubicación del vehiculo")
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lugar))
    }

    fun getLocation() {
        val newUbication = ubicacion.substring(ubicacion.indexOf("(") + 1, ubicacion.indexOf(")"))
        val s = newUbication.split(" ").toTypedArray()
        latitude = s[0].toDouble()
        longitude = s[1].toDouble()
    }

}