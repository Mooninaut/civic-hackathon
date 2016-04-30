package com.example.clement.myapplication2;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
/**
 * Created by Clement on 4/30/2016.
 */
public class Incident {
  public String major;
  public String minor;
  public int kind;
  public LatLng location;
  public Incident(LatLng l, String maj, String min, int k) {
    this.major = maj;
    this.minor = min;
    this.location = l;
    this.kind = k;
  }
  public Incident(double lat, double lon, String maj, String min, int k) {
    this.major = maj;
    this.minor = min;
    this.location = new LatLng(lat, lon);
    this.kind = k;
  }
  public Incident(int k, double lat, double lon, double recorded, double fixed, String description) {
    this.major = description;
    this.minor = description;
    this.location = new LatLng(lat, lon);
    this.kind = k;
  }
  public void plot(GoogleMap mMap) {
    mMap.addMarker(
        new MarkerOptions()
            .position(this.location)
            .title(this.major)
            .snippet(this.minor)
            .icon(
                BitmapDescriptorFactory.defaultMarker(
                    22.5f * (float) this.kind
                )
            )
    );
  }
}
