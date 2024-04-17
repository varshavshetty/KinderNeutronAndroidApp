package com.example.kinderneutron;

import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import java.io.BufferedInputStream;
import androidx.appcompat.app.AppCompatActivity;
import android.view.SurfaceHolder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import android.os.Handler;
import android.widget.VideoView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class landingpage1 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private static final String TAG = "landingpage1";
    private static final String MJPEG_URL = "http://192.168.29.173:8001/videostreamapi/";
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage1);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Replace "YOUR_SERVER_URL" with the actual URL of your Django server
        String serverUrl = "http://192.168.29.173:8001/videostreamapi/";

        webView.loadUrl(serverUrl);

        // Enable video playback in the WebView
        webView.setWebChromeClient(new WebChromeClient());
    }
    
}
