package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShedOwnersPortal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shed_owners_portal);
    }

    public void openUpdateFuel(View view){
        Intent intent = new Intent(this,UpdateFuelQuantity.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }

    public void openSignin(View view){
        Intent intent = new Intent(this,Login.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }
}