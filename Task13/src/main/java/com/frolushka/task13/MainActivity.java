package com.frolushka.task13;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://com.frolushka.task13/" + R.raw.crash));

        videoView.setMediaController(new MediaController(this));
        videoView.setZOrderOnTop(true);

        videoView.start();
        videoView.requestFocus();

    }
}
