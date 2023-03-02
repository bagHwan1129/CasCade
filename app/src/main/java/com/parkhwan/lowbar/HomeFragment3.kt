package com.parkhwan.lowbar

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import net.daum.mf.map.api.MapView

class HomeFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3,container,false)
        val webview2 = view.findViewById<WebView>(R.id.instagramWebView)
        webview2.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
        webview2.loadUrl("https://instagram.com/cascade_bakerycafe?igshid=NTdlMDg3MTY=")

        return view
    }
}