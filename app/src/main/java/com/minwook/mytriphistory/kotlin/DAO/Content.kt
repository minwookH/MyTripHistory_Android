package com.minwook.mytriphistory.kotlin.DAO

class Content(title: String, location: String, description: String, latitude: Double
              , longtitude: Double, startDate: String, endDate: String) {

    var title: String? = null
    var location: String? = null
    var description: String? = null
    var latitude: Double = 0.toDouble()//위도
    var longtitude: Double = 0.toDouble()//경도
    var startDate: String? = null
    var endDate: String? = null

    init{
        this.title = title
        this.location = location
        this.description = description
        this.latitude = latitude
        this.longtitude = longtitude
        this.startDate = startDate
        this.endDate = endDate
    }



}