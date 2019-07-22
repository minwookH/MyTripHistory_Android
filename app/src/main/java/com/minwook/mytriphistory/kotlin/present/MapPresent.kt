package com.minwook.mytriphistory.kotlin.present

interface MapPresent {
    fun loadLocations()

    interface View {
        fun addMarker(latitude: Double, longtitude: Double, title: String)
        fun setCenterMap(latitude: Double, longtitude: Double)
    }
}