package com.minwook.mytriphistory.java.present;

public interface MapPresent {
    void loadLocations();

    interface View{
        void addMarker(double latitude, double longtitude, String title);
        void setCenterMap(double latitude, double longtitude);
    }
}

