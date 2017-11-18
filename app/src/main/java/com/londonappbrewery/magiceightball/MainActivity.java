package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);

        final ImageView magicball;
        magicball = (ImageView) findViewById(R.id.image_magicBall);

        final TextView comment;
        comment = (TextView) findViewById(R.id.text_comment);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        final int[] textArray = {R.string.Title1,
                R.string.Title2,
                R.string.Title3,
                R.string.Title4,
                R.string.Title5};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Magic Eight Ball","The button has been pressed");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                Log.d("Magic Eight Ball","the number is " + number);

                magicball.setImageResource(ballArray[number]);

                comment.setText(textArray[number]);
            }
        });




    }
}
