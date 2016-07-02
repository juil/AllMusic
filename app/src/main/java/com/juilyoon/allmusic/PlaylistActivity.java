package com.juilyoon.allmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        LinearLayout song1 = (LinearLayout) findViewById(R.id.song_01);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });
    }
}
