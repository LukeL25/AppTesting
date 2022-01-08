package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button HTPButton = (Button)findViewById(R.id.HowtoPlay);
        HTPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toHowToPlay(view);
            }

    });
        Button PlayButton = (Button)findViewById(R.id.PlayTheGame);
        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toGameInitialization(view);
            }
        });

    }

    //Called when the user taps the play button
    public void toGameInitialization(View view) {
        Intent intent = new Intent(this, InitializeGame.class);
        startActivity(intent);
    }


    //Called when the user taps the How to Play button
    public void toHowToPlay(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }


}
