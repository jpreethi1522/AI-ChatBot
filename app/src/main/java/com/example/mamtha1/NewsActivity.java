package com.example.mamtha1;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.web);

        // loading https://www.geeksforgeeks.org url in the WebView.
        webView.loadUrl("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());
    }
}