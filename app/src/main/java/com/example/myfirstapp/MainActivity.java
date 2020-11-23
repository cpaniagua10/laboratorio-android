package com.example.myfirstapp;


import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer sound1MP = MediaPlayer.create(this, R.raw.cat);
        final MediaPlayer sound2MP = MediaPlayer.create(this, R.raw.dog);
        final MediaPlayer sound3MP = MediaPlayer.create(this, R.raw.sound3);
        final MediaPlayer sound4MP = MediaPlayer.create(this, R.raw.sound4);
        final MediaPlayer sound5MP = MediaPlayer.create(this, R.raw.sound5);
        final MediaPlayer sound6MP = MediaPlayer.create(this, R.raw.sound6);
        Button buttonCat = (Button) this.findViewById(R.id.buttonCat);
        Button buttonDog = (Button) this.findViewById(R.id.buttonDog);
        Button buttonThree = (Button) this.findViewById(R.id.buttonThree);
        Button buttonFour = (Button) this.findViewById(R.id.buttonFour);
        Button buttonFive = (Button) this.findViewById(R.id.buttonFive);
        Button buttonSix = (Button) this.findViewById(R.id.buttonSix);


        buttonCat.setOnClickListener(new View.OnClickListener() {
            boolean clickedCat = false;
            @Override
            public void onClick(View v) {
                sound1MP.start();
                if (!clickedCat){
                    buttonCat.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedCat = true;
                }
                else {
                    buttonCat.setBackgroundColor(Color.parseColor("#D0DA4747"));
                    clickedCat = false;
                }
            }
        });
        buttonDog.setOnClickListener(new View.OnClickListener() {
            boolean clickedDog = false;
            @Override
            public void onClick(View v) {
                sound2MP.start();
                if (!clickedDog){
                    buttonDog.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedDog = true;
                }
                else {
                    buttonDog.setBackgroundColor(Color.parseColor("#FF5722"));
                    clickedDog = false;
                }
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            boolean clickedThree = false;
            @Override
            public void onClick(View v) {
                sound3MP.start();
                if (!clickedThree){
                    buttonThree.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedThree = true;
                }
                else {
                    buttonThree.setBackgroundColor(Color.parseColor("#FFC107"));
                    clickedThree = false;
                }
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            boolean clickedFour = false;
            @Override
            public void onClick(View v) {
                sound4MP.start();
                if (!clickedFour){
                    buttonFour.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedFour = true;
                }
                else {
                    buttonFour.setBackgroundColor(Color.parseColor("#673AB7"));
                    clickedFour = false;
                }
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            boolean clickedFive = false;
            @Override
            public void onClick(View v) {
                sound5MP.start();
                if (!clickedFive){
                    buttonFive.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedFive = true;
                }
                else {
                    buttonFive.setBackgroundColor(Color.parseColor("#22FFD3"));
                    clickedFive = false;
                }
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            boolean clickedSix = false;
            @Override
            public void onClick(View v) {
                sound6MP.start();
                if (!clickedSix){
                    buttonSix.setBackgroundColor(Color.parseColor("#FFB5F16F"));
                    clickedSix = true;
                }
                else{
                    buttonSix.setBackgroundColor(Color.parseColor("#E91E63"));
                    clickedSix = false;
                }
            }
        });
    }
}