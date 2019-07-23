package com.minwook.mytriphistory.kotlin.present

import com.minwook.mytriphistory.java.common.DumyData

class MapPresentImpl(var view: MapPresent.View): MapPresent {
    override fun loadLocations() {
        for (content in DumyData.getInstance().list) {
            view.addMarker(content.latitude, content.longtitude, content.title)
        }

        view.setCenterMap(37.551578, 126.989842)
    }
}