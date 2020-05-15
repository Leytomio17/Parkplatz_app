package com.example.parkplatz;

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
        LatLng BH_Parking = new LatLng(46.9496, 7.4384);
        mMap.addMarker(new MarkerOptions().position(BH_Parking).title("Bahnhof Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BH_Parking));

        LatLng BH_Kr_Parking = new LatLng(46.9496, 7.4384);
        mMap.addMarker(new MarkerOptions().position(BH_Kr_Parking).title("Bahnhof Kurz Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BH_Kr_Parking));

        LatLng PostParc = new LatLng(46.9482, 7.4374);
        mMap.addMarker(new MarkerOptions().position(PostParc).title("PostParc"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PostParc));
    }
}
