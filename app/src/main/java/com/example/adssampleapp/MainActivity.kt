package com.example.adssampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.InitializationStatus
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener

class MainActivity : AppCompatActivity() {
    private val adview by lazy<AdView>{
        findViewById(R.id.ad_view)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) { }
        Integer.MIN
        val adRequest = AdRequest.Builder().build()
        adview.loadAd(adRequest)
    }
}