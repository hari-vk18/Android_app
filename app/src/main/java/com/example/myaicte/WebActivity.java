
package com.example.myaicte;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load Power BI report using embed URL
        String embedUrl = "https://app.powerbi.com/view?r=eyJrIjoiOWUyZjM1ZjQtMjAxZC00ZjJjLTkzOTMtMzVkZjU4ODE0OGI3IiwidCI6ImE5MmFkYzVkLTczNTgtNDQ4OS04MWY1LWJkOGI3NTUyNzgyMCJ9";
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