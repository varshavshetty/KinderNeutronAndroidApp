package com.example.kinderneutron;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class landingpage1 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage1);

        // Get references to UI elements
        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);

        // Set media controller
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // URL of the video
        String videoUrl = "https://storage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4";

        // Set video URI
        Uri uri = Uri.parse(videoUrl);
        videoView.setVideoURI(uri);

        // Start playing the video
        videoView.start();
    }
}

