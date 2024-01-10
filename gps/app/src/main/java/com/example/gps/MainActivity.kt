package com.example.gps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import com.google.android.gms.location.FusedLocationProviderClient
import androidx.core.app.ActivityCompat
import android.content.pm.PackageManager
import android.location.LocationManager
import android.content.Context
import android.annotation.SuppressLint
import android.Manifest
import android.location.LocationManager.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object{
        const val PERMISSION_ID = 33
    }
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    val tvLatitude: TextView = findViewById(R.id.tvLatitude)
    val tvLongitude: TextView = findViewById(R.id.tvLongitude)
    val btnLocate: Button = findViewById(R.id.btnLocate)


            private fun checkGranted(permission: String): Boolean{
        return ActivityCompat.checkSelfPermission(this, permission) ==
                PackageManager.PERMISSION_GRANTED
            }            private fun checkPermissions() =
                checkGranted(android.Manifest.permission.ACCESS_COARSE_LOCATION) &&
                        checkGranted(android.Manifest.permission.ACCESS_FINE_LOCATION)
                        private fun requestPermissions() {
                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION,
                            android.Manifest.permission.ACCESS_FINE_LOCATION),
                        PERMISSION_ID
                    )
                        }
                        private fun isLocationEnabled() : Boolean {
                    var locationManager: LocationManager =
                        getSystemService(Context.LOCATION_SERVICE) as LocationManager
                    return locationManager.isProviderEnabled(GPS_PROVIDER) || locationManager.isProviderEnabled(NETWORK_PROVIDER)
                }
        @SuppressLint("MissingPermission")
        private fun getLocation() {
            if (checkPermissions()) {
                if (isLocationEnabled()) {
                    mFusedLocationClient.lastLocation.addOnSuccessListener(this) { location ->
                        tvLatitude.text = location?.latitude.toString()
                        tvLongitude.text = location?.longitude.toString()
                    }
                }
            } else{
                requestPermissions()
            }
        }



}