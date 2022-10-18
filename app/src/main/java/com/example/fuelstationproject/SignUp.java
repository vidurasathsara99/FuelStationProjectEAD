package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void openSignin(View view){
        Intent intent = new Intent(this,Login.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }
}