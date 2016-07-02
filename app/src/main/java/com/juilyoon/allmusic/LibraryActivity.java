package com.juilyoon.allmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageView playlist1 = (ImageView) findViewById(R.id.playlist_01);
        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        LinearLayout song1 = (LinearLayout) findViewById(R.id.song_01);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNowPlaying();
            }
        });

        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNowPlaying();
            }
        });
    }

    private void openNowPlaying() {
        Intent songIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
        startActivity(songIntent);
    }
}
