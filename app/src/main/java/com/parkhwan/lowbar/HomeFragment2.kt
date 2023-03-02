package com.parkhwan.lowbar

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class HomeFragment2(val image : Int) : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootview = inflater.inflate(R.layout.fragment_2,container,false)
        val webview = rootview.findViewById<WebView>(R.id.webView)

        webview.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
        webview.loadUrl("https://m.place.naver.com/restaurant/1442145951/home?entry=pll")





        return rootview
    }


}