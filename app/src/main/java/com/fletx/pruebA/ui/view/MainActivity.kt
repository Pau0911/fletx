package com.fletx.pruebA.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.fletx.pruebA.data.model.Vehicle
import com.fletx.pruebA.databinding.ActivityMainBinding
import com.fletx.pruebA.ui.viewmodel.VehicleViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: VehicleViewModel by viewModels()
    private lateinit var listVehicles: List<Vehicle>

    //private lateinit var mContacts: List<Vehicle>
    private lateinit var vAdapter: VehicleAdapter
    private lateinit var recycler: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recycler = binding.vehicleList
        viewModel.onCreate()
        viewModel.vehicles.observe(this, Observer {
            listVehicles = it
            setupRecyclerView()
        })

    }

    private fun setupRecyclerView() {
        recycler.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        vAdapter = VehicleAdapter(listVehicles, this) { vehicle ->
            vehicleOnClick(vehicle)
        }

        recycler.adapter = vAdapter
    }

    private fun vehicleOnClick(vehicle: Vehicle?) {
        vehicle?.let {
            Log.d("Prueba", "Click on: ${vehicle.lonlat}")

            navigateToDetail(it)
        }
    }

    private fun navigateToDetail(vehicle: Vehicle) {
        val intent = Intent(this, VehicleMap::class.java).apply {
            putExtra("ubicacion", vehicle.lonlat)
        }

        startActivity(intent)
    }
}