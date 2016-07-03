package com.juilyoon.allmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        LinearLayout song = (LinearLayout) findViewById(R.id.song_01);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying = new Intent(SearchActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });
    }
}
