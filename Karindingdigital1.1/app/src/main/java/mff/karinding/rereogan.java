package mff.karinding;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class rereogan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rereogan);
    }
    public void play_high(View v){
        MediaPlayer ring=MediaPlayer.create(rereogan.this,R.raw.rereogantinggi);
        ring.start();
    }
    public void play_low(View v){
        MediaPlayer ring=MediaPlayer.create(rereogan.this,R.raw.rereoganrendah);
        ring.start();
    }
    public void back(View v){
        Intent activity = new Intent(this, Secret.class);
        startActivity(activity);
        finish();
    }
}
