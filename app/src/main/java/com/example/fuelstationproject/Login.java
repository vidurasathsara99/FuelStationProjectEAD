package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openSignup(View view){
        Intent intent = new Intent(this,SignUp.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }

}