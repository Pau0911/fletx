package com.fletx.pruebA.ui.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fletx.pruebA.R
import com.fletx.pruebA.data.model.Vehicle
import java.util.ArrayList


class VehicleAdapter(
    private val vehicles: List<Vehicle>,
    private val context: Context,
    private val onClick: (Vehicle?) -> Unit
) : RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vehicle_list_item, parent, false)
        return VehicleViewHolder(view)
    }

    override fun onBindViewHolder(holderContact: VehicleViewHolder, position: Int) {
        val vehicle = vehicles[position]
        holderContact.bind(vehicle = vehicle)
    }

    override fun getItemCount(): Int {
        return vehicles.size
    }

    inner class VehicleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var plateLabel: TextView = itemView.findViewById(R.id.textview_plate)
        private var driverLabel: TextView = itemView.findViewById(R.id.textview_driver)
        private var trilerLabel: TextView = itemView.findViewById(R.id.textview_trailer)
        private var imageView: ImageView = itemView.findViewById(R.id.imageview_thumb)
        private var availability:TextView= itemView.findViewById(R.id.textview_availability)
        private var currentVehicle: Vehicle? = null

        init {
            itemView.setOnClickListener {
                onClick(currentVehicle)
            }
        }
        fun bind(vehicle: Vehicle?) {
            currentVehicle = vehicle

            if(vehicle?.driver!=null){
                driverLabel.text=vehicle.driver.full_name

            }else{
                driverLabel.text="Sin conductor"
            }
            if(vehicle?.trailer!=null){
                trilerLabel.text = vehicle?.trailer?.cartype?.kind
            }else{
                trilerLabel.text="Sin trailer"
            }
            plateLabel.text= vehicle?.placa

            Glide.with(context)
                .load(vehicle?.front_vehicle?.url?.replace("prueba","staging"))
                .into(imageView)
        }
    }

    companion object {
        private const val TAG = "VehicleAdapter"
    }
}