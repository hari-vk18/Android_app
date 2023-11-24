package com.example.myaicte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class StasticsActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stastics);
        webView = findViewById(R.id.webView4);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load Power BI report using embed URL
        String embedUrl = "https://app.powerbi.com/view?r=eyJrIjoiY2E4NzY0MGEtNTdmNS00NWQ0LWIwOTktY2I5ZmZjOTAzMWZmIiwidCI6ImE5MmFkYzVkLTczNTgtNDQ4OS04MWY1LWJkOGI3NTUyNzgyMCJ9";
        webView.loadUrl(embedUrl);
    }
}