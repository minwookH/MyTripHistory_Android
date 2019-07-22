package com.minwook.mytriphistory.java.present;

import android.content.Context;
import android.util.Log;

import com.minwook.mytriphistory.java.DAO.Content;
import com.minwook.mytriphistory.java.common.DumyData;

public class MapPresentImpl implements MapPresent {

    private Context context;
    private MapPresent.View view;

    public MapPresentImpl(Context context, MapPresent.View view){
        this.context = context;
        this.view = view;
    }

    @Override
    public void loadLocations() {
        Log.d("test", "loadLocations start");
        for (Content content :
                DumyData.getInstance().getList()) {
            view.addMarker(content.getLatitude(), content.getLongtitude(), content.getTitle());
        }

        view.setCenterMap(37.551578, 126.989842);
        //37.551578, 126.989842  서울 중간
    }
}
