package com.example.chopstickz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    EditText username, pwd;
    Button btnLogIn;
    TextView tvForgotThePassword;
    TextView tvRegister;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mFirebaseAuth= FirebaseAuth.getInstance();
        username = findViewById(R.id.username);
        pwd = findViewById(R.id.pwd);
        btnLogIn = findViewById(R.id.buttonLogin);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tvForgotThePassword = findViewById(R.id.ftp);
        tvRegister = findViewById(R.id.reg);
    }
}
