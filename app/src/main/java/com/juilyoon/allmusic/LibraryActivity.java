package com.juilyoon.allmusic;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageView playlist1 = (ImageView) findViewById(R.id.playlist_01);
        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylist = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(openPlaylist);
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

    public void hideNotes(View view) {
        view.setVisibility(View.GONE);
    }
}
