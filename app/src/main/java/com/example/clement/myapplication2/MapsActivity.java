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
        LatLng fishers = new LatLng(39.966762,-86.0108277);
        /*LatLng fishers2 = new LatLng(39.96,-86.02);
        LatLng fishers3 = new LatLng(39.965,-86.005);
        LatLng fishers4 = new LatLng(39.956,-86.014);*/
        /*mMap.addMarker(
            new MarkerOptions()
                .position(fishers)
                .title("Marker in Fishers")
                .snippet("There are a bunch of nerds here.")
                .icon(
                    BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_AZURE
                )
            )
        );*/
        /* new Incident(39.966762,-86.0108277, "major", "minor", 2).plot(mMap);
        new Incident(39.96,-86.02, "major2", "minor2", 11).plot(mMap);
        new Incident(39.965,-86.005, "major3", "minor3", 14).plot(mMap);
        new Incident(39.956,-86.014, "major4", "minor4", 5).plot(mMap);
        */
      Incident inc[] = new Incident[27];
      inc[0] = new Incident(7,39.1508,-86.5211,40049.14,40053.14,"c");
      inc[1] = new Incident(13,39.147,-86.5236,39218.582,39220.582,"crack debri"               );
      inc[2] = new Incident(1,39.1654,-86.5325,37632.905,37633.905,"alk"                       );
      inc[3] = new Incident(9,39.1576,-86.5293,37293.834,37296.834,"ack debris "               );
      inc[4] = new Incident(9,39.1736,-86.5216,39133.606,39135.606,"k debris "                 );
      inc[5] = new Incident(11,39.1692,-86.5205,38246.229,38247.229,"alk crack deb"            );
      inc[6] = new Incident(11,39.1687,-86.521,40812.987,40813.987,"id"                        );
      inc[7] = new Incident(9,39.1571,-86.5168,38196.876,38198.876,"r"                         );
      inc[8] = new Incident(2,39.1688,-86.5358,38051.209,38053.209,"ris"                       );
      inc[9] = new Incident(13,39.1696,-86.5321,41579.003,41583.003," cra"                     );
      inc[10] = new Incident(1,39.1687,-86.5188,37471.313,37473.313,"ebris"                    );
      inc[11] = new Incident(5,39.1575,-86.5209,37556.182,37557.182,"k d"                      );
      inc[12] = new Incident(1,39.1646,-86.529,40725.428,40727.428,"bris the "                 );
      inc[13] = new Incident(6,39.1748,-86.5286,37836.93,37839.93,"ack debris t"               );
      inc[14] = new Incident(10,39.1607,-86.53,38725.124,38727.124,"is the and"                );
      inc[15] = new Incident(4,39.167,-86.5197,39335.856,39336.856,"alk cr"                    );
      inc[16] = new Incident(5,39.1682,-86.5264,38372.189,38373.189,"sidew"                    );
      inc[17] = new Incident(13,39.1712,-86.5361,42041.93,42044.93,"debris the "               );
      inc[18] = new Incident(6,39.1749,-86.5183,41196.126,41197.126,"debris the a"             );
      inc[19] = new Incident(13,39.1669,-86.5236,39064.896,39069.896,"k crack debris the a"    );
      inc[20] = new Incident(4,39.1718,-86.5201,40804.196,40806.196,"alk c"                    );
      inc[21] = new Incident(13,39.166,-86.5294,41679.409,41681.409,"rack debris t"            );
      inc[22] = new Incident(10,39.1597,-86.5327,41395.021,41400.021,"ewalk crac"              );
      inc[23] = new Incident(9,39.1514,-86.5233,38546.713,38547.713,"lk crack"                 );
      inc[24] = new Incident(2,39.163,-86.5169,38382.2,38387.2,"ewalk c"                       );
      inc[25] = new Incident(9,39.1555,-86.524,42282.517,42283.517,"k debris the"              );
      inc[26] = new Incident(11,39.1689,-86.5333,39136.473,39137.473,"e and"                   );

      /*for (double d = 0.0; d < Math.PI * 2.0; d += (Math.PI / 8.0)) {
          double lat = Math.sin(d) * 0.01;
          double lon = Math.cos(d) * 0.01;
          new Incident(
              39.966762 + lat,
              -86.0108277 + lon,
              String.valueOf(d),
              String.valueOf(d),
              (int)Math.round(2*d)).plot(mMap);
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fishers, 14.0f));
        */
      for (int i = 0; i <= 26; i++) {
        inc[i].plot(mMap);
      }
      mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fishers, 14.0f));
    }

}
