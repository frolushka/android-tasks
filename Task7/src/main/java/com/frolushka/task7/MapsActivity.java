package com.frolushka.task7;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    int i = -1;

    static final double[] x = new double[] { 55.806891, 48.8183958, 55.6698587 };
    static final double[] y = new double[] { 37.541834, 44.6868403, 37.2775105 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                onMapReady(mMap);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        i = (i + 1) % x.length;
        // Add a marker in Sydney and move the camera
        LatLng city = new LatLng(x[i], y[i]);
        mMap.addMarker(new MarkerOptions().position(city).title("К следующему?"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(city));
    }
}
