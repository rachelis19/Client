package com.example.client_side.UI.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import com.example.client_side.R;


public class MainActivity extends AppCompatActivity {

    private EditText emailText;
    private EditText passwordText;
    private Button login;
    private Button signUpb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        signUpb.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });
    }



    private void findViews()
    {
        emailText=findViewById(R.id.userNameEmail);
        passwordText=findViewById(R.id.password);
        login=(Button)findViewById(R.id.btn_login);
        signUpb=(Button)findViewById(R.id.signUp);
    }
}
