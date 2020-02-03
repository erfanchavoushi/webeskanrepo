package com.azarnush.ptmalborz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class WebLogFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_web_log, container, false);
        HomeActivity.toolbar.setTitle("وبلاگ");

        WebView myWebView = root.findViewById(R.id.wv_weblog);
        myWebView.loadUrl("https://webeskan.com/Blog");
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        HomeActivity.toolbar.setTitle("وبلاگ");
    }
}
