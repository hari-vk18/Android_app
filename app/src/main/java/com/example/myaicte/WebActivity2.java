package com.example.myaicte;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity2 extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        webView = findViewById(R.id.webView2);

        // Enable JavaScript
        //WebSettings webSettings = webView.getSettings();
        // webSettings.setJavaScriptEnabled(true);

        // Load Power BI report using embed URL
        String embedUrl = "https://internship.aicte-india.org/";
        webView.loadUrl(embedUrl);

        // WebView settings
       /* webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // Handle navigation events here if needed.
                view.loadUrl(url);
                return true;
            }
        });*/

    }
}