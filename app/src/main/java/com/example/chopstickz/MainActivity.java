package com.example.chopstickz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isLoggedIn = false;

        if (isLoggedIn) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent homeIntent = new Intent(MainActivity.this, FoodSelectionActivity.class);
                    startActivity(homeIntent);
                    finish();

                }
            }, SPLASH_TIME_OUT);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, LogInActivity.class);
                    startActivity(intent);
                    finish();

                }
            }, SPLASH_TIME_OUT);
        }


    }


    private void storeLogInActivity{
        SharedPreferences mSharedPrefences = getSharedPreferences(LogInActivity)
    }
}