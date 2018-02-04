package mff.sulingv2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Secret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
    }
    public void play_da(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.da);
        ring.start();
    }
    public void play_mi(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.mi);
        ring.start();
    }
    public void play_na(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.na);
        ring.start();
    }
    public void play_ti(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.ti);
        ring.start();
    }
    public void play_la(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.la);
        ring.start();
    }
    public void play_da1(View v){
        MediaPlayer ring=MediaPlayer.create(Secret.this,R.raw.da1);
        ring.start();
    }
}
