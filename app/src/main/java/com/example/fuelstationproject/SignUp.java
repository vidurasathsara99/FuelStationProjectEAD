package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText email,password,name,phone;
    Button signup;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.emailS);
        password = findViewById(R.id.passwordS);
        name = findViewById(R.id.nameS);
        phone = findViewById(R.id.phoneS);
        signup = findViewById(R.id.signupBtn);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em = email.getText().toString();
                String pw = password.getText().toString();
                String nam = name.getText().toString();
                String pho = phone.getText().toString();

                if (TextUtils.isEmpty(em) || TextUtils.isEmpty(pw) || TextUtils.isEmpty(nam) || TextUtils.isEmpty(pho)) {
                    Toast.makeText(SignUp.this,"All fields required",Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkuser = DB.checkemail(em);
                    if (checkuser == false) {
                        Boolean insert = DB.insertData(em,pw,nam,pho);
                        if(insert==true){
                            Toast.makeText(SignUp.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
                            if(em=="admin@abc.com"){
                                Intent intent = new Intent(getApplicationContext(),AdminShedList.class);
                                startActivity(intent);
                            }
                            else{
                                Intent intent = new Intent(getApplicationContext(),ShedList.class);
                                startActivity(intent);
                            }

                        }
                        else {
                            Toast.makeText(SignUp.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                        }

                    }
                    else {
                        Toast.makeText(SignUp.this,"User already exists",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        }
    public void openSignin(View view){
        Intent intent = new Intent(this,Login.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }
}