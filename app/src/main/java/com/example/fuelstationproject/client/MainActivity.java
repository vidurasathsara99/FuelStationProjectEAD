package com.example.fuelstationproject.client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fuelstationproject.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void markArrival(View v)
    {
        Button button = findViewById(R.id.buttonarrival);
        button.setOnClickListener(View-> {

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat(" d MMM yyyy HH:mm:ss ");
            String time =  format.format(calendar.getTime());

            TextView textView = findViewById(R.id.textView11);
            textView.setText(time);
            Toast.makeText(getBaseContext(), "Successfully Marked Arrival Time!" , Toast.LENGTH_SHORT ).show();

        });
    }

    public void markDeparture(View v)
    {
        Button button = findViewById(R.id.buttondeparture);
        button.setOnClickListener(View-> {

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat(" d MMM yyyy HH:mm:ss ");
            String time =  format.format(calendar.getTime());

            TextView textView = findViewById(R.id.textView11);
            textView.setText(time);
            Toast.makeText(getBaseContext(), "Successfully Marked Departure Time!" , Toast.LENGTH_SHORT ).show();
        });
    }

//     public void markArrival(){
//        Button button = findViewById(R.id.buttonarrival);
//        button.setOnClickListener(v -> {
//
//            Calendar calendar = Calendar.getInstance();
//            SimpleDateFormat format = new SimpleDateFormat(" d MMM yyyy HH:mm:ss ");
//            String time =  format.format(calendar.getTime());
//
//            TextView textView = findViewById(R.id.textView11);
//            textView.setText(time);
//        });
//    }

   // Button clickButton = (Button) findViewById(R.id.clickButton);
  //  clickButton.setOnClickListener( new OnClickListener() {

//        @Override
//        public void onClick(View v) {
//            // TODO Auto-generated method stub
//            Button button = findViewById(R.id.buttonarrival);
//            button.setOnClickListener(v -> {
//
//                Calendar calendar = Calendar.getInstance();
//                SimpleDateFormat format = new SimpleDateFormat(" d MMM yyyy HH:mm:ss ");
//                String time =  format.format(calendar.getTime());
//
//                TextView textView = findViewById(R.id.textView11);
//                textView.setText(time);
//            });
//        }
//    });

//    Button clickButton = (Button) findViewById(R.id.buttonarrival);
//    clickButton.setOnClickListener( new void OnClickListener() {
//
//        @Override
//        public void onClick(View v) {
//            // TODO Auto-generated method stub
//                ***Do what you want with the click here***
//        }
//    });


}
