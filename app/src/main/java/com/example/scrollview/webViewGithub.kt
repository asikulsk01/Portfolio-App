package com.example.scrollview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import androidx.annotation.RequiresApi

class webViewGithub : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_github)

        val myWebViewLayout= findViewById<WebView>(R.id.webViewMygithubPage)

        webViewSetup(myWebViewLayout)
    }

    //Method define
   @RequiresApi(Build.VERSION_CODES.O)
   private fun webViewSetup(webview: WebView){
       webview.webViewClient= WebViewClient()
        webview.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl("https://github.com/asikulsk01")
        }
   }
}