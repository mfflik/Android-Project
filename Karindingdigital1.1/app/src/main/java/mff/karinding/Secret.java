package mff.karinding;

import android.content.Intent;
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

    public void goTotongeret(View v){
        Intent activity = new Intent(this, Tonggeret.class);
        startActivity(activity);
        finish();
    }
    public void goTogogon(View v){
        Intent activity = new Intent(this, gongondangan.class);
        startActivity(activity);
        finish();
    }
    public void goTorereogan(View v){
        Intent activity = new Intent(this, rereogan.class);
        startActivity(activity);
        finish();
    }
    public void goToiring(View v){
        Intent activity = new Intent(this, iring.class);
        startActivity(activity);
        finish();
    }
}
