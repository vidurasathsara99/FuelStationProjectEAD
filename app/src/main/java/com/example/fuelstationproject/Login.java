package com.example.fuelstationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText email,password;
    Button signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.emailL);
        password = findViewById(R.id.passwordL);
        signin = findViewById(R.id.loginBtn);
        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em = email.getText().toString();
                String pw = password.getText().toString();

                if (TextUtils.isEmpty(em) || TextUtils.isEmpty(pw) ) {
                    Toast.makeText(Login.this,"All fields required",Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkuser = DB.checkemailpw(em,pw);
                    if (checkuser) {
                            Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_SHORT).show();
                            if(em.equals("admin@abc.com")){
                                Intent intent = new Intent(getApplicationContext(),ShedOwnersPortal.class);
                                Bundle b = new Bundle();
                                intent.putExtras(b);
                                startActivity(intent);
                            }
                            else{
                                Intent intent1 = new Intent(getApplicationContext(),ShedList.class);
                                Bundle b = new Bundle();
                                intent1.putExtras(b);
                                startActivity(intent1);
                            }
                    }
                    else {
                        Toast.makeText(Login.this,"Email or Password Invalid",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void openSignup(View view){
        Intent intent = new Intent(this,SignUp.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
    }

}