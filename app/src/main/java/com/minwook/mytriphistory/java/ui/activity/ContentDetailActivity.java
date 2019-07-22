package com.minwook.mytriphistory.ui.activity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.R;
import com.minwook.mytriphistory.present.ContentDetailPresent;
import com.minwook.mytriphistory.present.ContentDetailPresentImpl;

public class ContentDetailActivity extends AppCompatActivity implements OnMapReadyCallback, ContentDetailPresent.View {
    private GoogleMap mMap;
    private String TAG = this.getClass().getName();

    private TextView title;
    private TextView location;
    private TextView date;
    private TextView description;
    private MapView mapView;

    private ContentDetailPresentImpl contentDetailPresent;

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_detail);

        title = findViewById(R.id.detail_title);
        location = findViewById(R.id.detail_location);
        date = findViewById(R.id.detail_date);
        description = findViewById(R.id.detail_description);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_map);
        mapFragment.getMapAsync(this);

        position = getIntent().getIntExtra("position", 0);
        contentDetailPresent = new ContentDetailPresentImpl(this, this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        Log.d(TAG, "onMapReady start");
        mMap = googleMap;
        contentDetailPresent.loadData(position);
    }

    @Override
    public void setText(Content content) {
        title.setText(content.getTitle());
        location.setText(content.getLocation());
        date.setText(content.getStartDate() + " ~ " + content.getEndDate());
        description.setText(content.getDescription());
    }

    @Override
    public void addMarker(double latitude, double longtitude, String title) {
        Log.d(TAG, "addMarker start");
        LatLng location = new LatLng(latitude, longtitude);
        mMap.addMarker(new MarkerOptions().position(location).title(title));
    }

    @Override
    public void setCenterMap(double latitude, double longtitude) {
        Log.d(TAG, "setCenterMap start");
        LatLng center = new LatLng(latitude, longtitude);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
    }
}
