package com.londonappbrewery.dice_nested_debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        Button myButton = (Button) findViewById(R.id.rollButton);

        final int[] diceArray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(7);
                Log.d("Dicee", "The number is " + number );

                int imageResourceId = diceArray[number];
                leftDice.setImageResource(imageResourceId);

                number = randomNumberGenerator.nextInt(700);
                imageResourceId = diceArray[number];
                rightDice.setImageResource(imageResourceId);

                double addition = 1.0 + 0.00000000000000000000000000000001;
                Log.d("Dicee", "" + addition) ;

            }
        });


    }
}
