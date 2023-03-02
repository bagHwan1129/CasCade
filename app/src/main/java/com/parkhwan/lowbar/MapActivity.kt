package com.parkhwan.lowbar

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.location.LocationRequest
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView

class MapActivity : AppCompatActivity() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val mapView = MapView(this)
        val mapViewContainer = findViewById<View>(R.id.map_view) as ViewGroup
        mapViewContainer.addView(mapView)

        val mapPoint = MapPoint.mapPointWithGeoCoord(37.290713,127.425190)

        mapView.setMapCenterPoint(mapPoint,true)
        mapView.setZoomLevel(1,true)

        val marker = MapPOIItem()
        marker.itemName = "CasCade"
        marker.mapPoint = mapPoint
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.

        mapView.addPOIItem(marker)

        val btnSearch = findViewById<Button>(R.id.btn_search) as Button



        btnSearch.setOnClickListener {
            val url2 : String ="kakaomap://route?sp=37.537229,127.005515&ep=37.290713,127.425190&by=CAR"
            var intent =  Intent(Intent.ACTION_VIEW, Uri.parse(url2))
            var list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)

            startActivity(intent)


        }



    }
}

