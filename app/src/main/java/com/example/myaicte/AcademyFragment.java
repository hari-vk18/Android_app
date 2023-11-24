package com.example.myaicte;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AcademyFragment#} factory method to
 * create an instance of this fragment.
 */
public class AcademyFragment extends Fragment {

    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_academy, container, false);


        webView = view.findViewById(R.id.webViewAcad);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        String url = "https://www.aicte-india.org/atal";
        webView.loadUrl(url);

        return view;
    }
}