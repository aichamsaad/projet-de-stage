package com.example.page2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private ImageView photoImageView;
    private EditText usernameEditText, passwordEditText, emailEditText;
    private Button loginButton;
    private TextView errorTextView;
    private EditText inputCode1, inputCode2, inputCode3, inputCode4, inputCode5, inputCode6;
    private TextView textMobile;
    private ImageView imageView;
    private TextView textViewVerification;
    private TextView textViewSendOTP;
    private TextView textViewMobileNumber;
    private TextView textView212;
    private EditText editTextMobileNumber;
    private Button buttonGetOTP;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoImageView = findViewById(R.id.photoImageView);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        emailEditText = findViewById(R.id.Email);
        loginButton = findViewById(R.id.loginButton);
        errorTextView = findViewById(R.id.errorTextView);

        loginButton.setOnClickListener(view -> {
            // Implement login functionality here
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp);

        imageView = findViewById(R.id.imageView);
        textViewVerification = findViewById(R.id.textViewVerification);
        textViewSendOTP = findViewById(R.id.textViewSendOTP);
        textViewMobileNumber = findViewById(R.id.textViewMobileNumber);
        textView212 = findViewById(R.id.textView212);
        editTextMobileNumber = findViewById(R.id.editTextMobileNumber);
        buttonGetOTP = findViewById(R.id.buttonGetOTP);

        // Add your code here
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputCode1 = findViewById(R.id.inputCode1);
        inputCode2 = findViewById(R.id.inputCode2);
        inputCode3 = findViewById(R.id.inputCode3);
        inputCode4 = findViewById(R.id.inputCode4);
        inputCode5 = findViewById(R.id.inputCode5);
        inputCode6 = findViewById(R.id.inputCode6);

        textMobile = findViewById(R.id.textMobile);
        textMobile.setText("+91 XXXXXXXXXX");

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputCode1.requestFocus();
            }
        });
    }
}
