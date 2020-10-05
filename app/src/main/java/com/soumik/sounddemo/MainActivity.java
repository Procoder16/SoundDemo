package com.soumik.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer harley;

    public void play(View view){
       
        harley.start();
    }
    public void pause(View view){

        harley.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        harley = MediaPlayer.create(this, R.raw.harley);
    }
}