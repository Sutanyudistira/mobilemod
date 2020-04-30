package com.example.cobamod5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sman = new LatLng(-7.6198938,111.8959273);
        LatLng smpn = new LatLng(-7.6017117,111.8988881);
        LatLng sdng = new LatLng(-7.6042983,111.9042519);
        mMap.addMarker(new MarkerOptions().position(sman).title("Marker in SMAN 2 Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sman));

        mMap.addMarker(new MarkerOptions().position(smpn).title("Marker in SMPN 1 Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn));

        mMap.addMarker(new MarkerOptions().position(sdng).title("Marker in SDN GanungKidul 1 Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sdng));
    }
}
