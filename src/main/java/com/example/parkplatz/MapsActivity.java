package com.example.parkplatz;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONObject;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {



    private GoogleMap mMap;
    private Object Marker;


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

        LatLngBounds SWITZERLAND = new LatLngBounds(
                new LatLng(-44, 113), new LatLng(-10, 154));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SWITZERLAND.getCenter(), 10));

        // Create a LatLngBounds that includes the city of Bern in Switzerland.
        LatLngBounds Bern = new LatLngBounds(
                new LatLng(46.94, 7.43), new LatLng(47, 7.61));
    // Constrain the camera target to the Bern bounds.
        mMap.setLatLngBoundsForCameraTarget(Bern);

        // Set a preference for minimum and maximum zoom.
        mMap.setMinZoomPreference(13.0f);
        mMap.setMaxZoomPreference(17.0f);

        // Add a marker and move the camera
        // Kurs = Kursaal
        // PR = Park+Ride
        // Cas = casino
        // Mobi = Mobiliar
        // CW = City West
        // Amag = amag Rathaus Parking
        // BH = Bahnhof
        LatLng BH_Parking = new LatLng(46.9496, 7.4384);
        mMap.addMarker(new MarkerOptions().position(BH_Parking).title("Bahnhof Parking / Kurzparking").snippet("Population: 4,137,400"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BH_Parking));


        LatLng PostParc = new LatLng(46.9482, 7.4374);
        mMap.addMarker(new MarkerOptions().position(PostParc).title("PostParc"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PostParc));

        LatLng Metro_Parking = new LatLng(46.9500, 7.4450);
        mMap.addMarker(new MarkerOptions().position(Metro_Parking).title("Metro Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Metro_Parking));

        LatLng Amag_Parking = new LatLng(46.9490, 7.4518);
        mMap.addMarker(new MarkerOptions().position(Amag_Parking).title("amag Rathaus Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Amag_Parking));

        LatLng CW_Parking = new LatLng(46.9466, 7.4343);
        mMap.addMarker(new MarkerOptions().position(CW_Parking).title("City West Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW_Parking));

        LatLng Mobi_Parking = new LatLng(46.9450, 7.4383);
        mMap.addMarker(new MarkerOptions().position(Mobi_Parking).title("Mobiliar Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mobi_Parking));

        LatLng Cas_Parking = new LatLng(46.9468, 7.4478);
        mMap.addMarker(new MarkerOptions().position(Cas_Parking).title("Casino Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cas_Parking));

        LatLng Expo_Parking = new LatLng(46.9568, 7.4683);
        mMap.addMarker(new MarkerOptions().position(Expo_Parking).title("Expo Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Expo_Parking));

        LatLng PR_Neuenfeld = new LatLng(46.9635, 7.4319);
        mMap.addMarker(new MarkerOptions().position(PR_Neuenfeld).title("Park+Ride Neuenfeld"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PR_Neuenfeld));

        LatLng Kurs_Parking = new LatLng(46.9534, 7.4486);
        mMap.addMarker(new MarkerOptions().position(Kurs_Parking).title("Expo Parking"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kurs_Parking));
    }
}
