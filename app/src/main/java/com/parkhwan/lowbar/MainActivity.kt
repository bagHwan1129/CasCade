package com.parkhwan.lowbar

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.media.tv.TvContract.Programs.Genres.encode
import android.net.Uri
import android.net.Uri.encode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import java.net.URLEncoder.encode
import java.security.MessageDigest
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var bottomnav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())
        bottomnav = findViewById(R.id.bottomnav)as BottomNavigationView



        bottomnav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->{
                    loadFragment(HomeFragment())
                    true
                }
                R.id.introduce->{
                    loadFragment(HomeFragment2(R.drawable.img1))
                    true
                }
                R.id.profile->{
                    loadFragment(HomeFragment3())
                    true
                }
                else -> false
            }
        }


    }

    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }





}