package com.minwook.mytriphistory.present;

import com.minwook.mytriphistory.DAO.Content;

import java.util.ArrayList;

public interface MapPresent {
    void loadLocations();

    interface View{
        void addMarker(double latitude, double longtitude, String title);
        void setCenterMap(double latitude, double longtitude);
    }
}

