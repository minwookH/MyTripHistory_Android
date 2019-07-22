package com.minwook.mytriphistory.kotlin.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.minwook.mytriphistory.R
import com.minwook.mytriphistory.kotlin.present.MapPresent
import com.minwook.mytriphistory.kotlin.present.MapPresentImpl
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment: Fragment(), OnMapReadyCallback, MapPresent.View  {
    private lateinit var mMap: GoogleMap
    private lateinit var mapPresent: MapPresentImpl

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        mapView.getMapAsync(this)

        mapPresent = MapPresentImpl(this)
    }


    override fun onMapReady(googleMap: GoogleMap?) {
        googleMap?.let{
            mMap = it
            mapPresent.loadLocations()
        }
    }

    override fun addMarker(latitude: Double, longtitude: Double, title: String) {
        val location = LatLng(latitude, longtitude)
        mMap.addMarker(MarkerOptions().position(location).title(title))

    }

    override fun setCenterMap(latitude: Double, longtitude: Double) {
        val center = LatLng(latitude, longtitude)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center))
        mMap.animateCamera(CameraUpdateFactory.zoomTo(11f))
    }
}