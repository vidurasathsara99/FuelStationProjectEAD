package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdateFuelQuantity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_fuel_quantity);
    }

    public void backToHome(View view){
        Intent intent = new Intent(this,ShedOwnersPortal.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }
}