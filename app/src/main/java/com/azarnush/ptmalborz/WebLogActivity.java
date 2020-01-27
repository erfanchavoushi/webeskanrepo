package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_log);

        WebView myWebView = findViewById(R.id.wv_weblog);
        myWebView.loadUrl("https://webeskan.com/Blog");
    }
}
