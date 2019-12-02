package com.example.chopstickz;

import androidx.annotation.NonNull;
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
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();


                            if (mFirebaseUser == null) {
                                // Not signed in, launch the Sign In activity


                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        startActivity(new Intent(MainActivity.this, LogInActivity.class));
                                        finish();
                                    }

                            },SPLASH_TIME_OUT);
            return;
        } else {
            Intent homeIntent = new Intent(MainActivity.this, FoodSelectionActivity.class);
                           startActivity(homeIntent);
                           finish();
            }
        }

//        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
//                if (mFirebaseUser == null) {
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            Intent intent = new Intent(MainActivity.this, LogInActivity.class);
//                            startActivity(intent);
//                            finish();
//
//                        }
//                    }, SPLASH_TIME_OUT);
//
//                } else {
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            Intent homeIntent = new Intent(MainActivity.this, FoodSelectionActivity.class);
//                            startActivity(homeIntent);
//                            finish();
//
//                        }
//                    }, SPLASH_TIME_OUT);
//                }
//
//            }
//        };
//
//        boolean isLoggedIn = false;
//
//        if (isLoggedIn) {
//
//        } else {
//
//        }




//
    private void storeLogInActivity(boolean userloggedin) {
        SharedPreferences mSharedPrefences = getSharedPreferences("chopstickz", MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mSharedPrefences.edit();
        mEditor.putBoolean("userloggedin", userloggedin);
        mEditor.apply();
    }


    private boolean getBoolean() {
        SharedPreferences mSharedPrefernces = getSharedPreferences("chopstickz", MODE_PRIVATE);
        boolean selectedBoolean = mSharedPrefernces.getBoolean("userloggedin", false);
        return selectedBoolean;
    }


}