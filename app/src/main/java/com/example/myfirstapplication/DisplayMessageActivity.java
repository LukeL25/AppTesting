package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = "This game must be played with at least 3 players. The game is played with one player as the spy and the rest of the players as FBI agents.\n" +
                "    Roles are determined by the application and are to be kept secret. Each FBI agent is to receive a location, and the spy is to figure out what the location is. Players\n" +
                "    will take turns asking other players to describe the location, being sure not to give away what the location actually is so that the spy could guess it. FBI agents\n" +
                "    want to catch a player incorrectly describing the location, since that would clue in who the spy is. Anytime an agent can guess who the spy is or the spy can guess the\n" +
                "    location. If the spy is correct or an agent is incorrect in their guess, the spy wins. If the agent guesses correctly or the spy guesses incorrectly, the agents win.";

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(message);
    }


}