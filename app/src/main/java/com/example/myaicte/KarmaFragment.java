package com.example.myaicte;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KarmaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KarmaFragment extends Fragment {

    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_karma, container, false);
        webView = view.findViewById(R.id.webViewKarma);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        String url = "https://www.aicte-india.org/schemes/KARMA";
        webView.loadUrl(url);
        return view;
    }
}