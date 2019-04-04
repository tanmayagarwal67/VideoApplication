package com.example.myvideoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    public void click(View view)
    {

        VideoView videoView=(VideoView)findViewById(R.id.videoView3);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.introvideo);
        //MediaController mediaController = new MediaController(this);
        //mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);
         videoView.animate().rotationY(360).setDuration(1000);
        videoView.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView=(VideoView)findViewById(R.id.videoView3);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.introvideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.animate().rotationY(360).setDuration(1000);
        videoView.start();

    }
}
