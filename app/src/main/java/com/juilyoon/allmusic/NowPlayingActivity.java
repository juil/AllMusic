package com.juilyoon.allmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
    }

    public void openUpNext(View view) {
        Intent upNext = new Intent(NowPlayingActivity.this, UpNextActivity.class);
        startActivity(upNext);
    }

    public void hideNotes(View view) {
        view.setVisibility(View.GONE);
    }
}
