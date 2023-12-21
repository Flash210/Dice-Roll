package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImageView;
    private TextView diceValueTextView;
    private Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImageView = findViewById(R.id.diceImageView);
        diceValueTextView = findViewById(R.id.diceValueTextView);
        rollButton = findViewById(R.id.rollButton);
    }

    public void onRollButtonClick(View view) {
        rollDice();
    }

    private void rollDice() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1; // Generates random number from 1 to 6

        // Set the appropriate dice image based on the random number
        int drawableResource = getResources().getIdentifier("dice" + randomNumber, "drawable", getPackageName());
        diceImageView.setImageResource(drawableResource);

        // Update the dice value text
        diceValueTextView.setText("Dice Value: " + randomNumber);
    }
}