package com.mobilebees.techgeeks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText pass;
    Button logIn, registerHere;
    TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.editTextUserName1);
        pass=findViewById(R.id.editTextPassword2);
        logIn=findViewById(R.id.btnLogin);
        forgotPass=findViewById(R.id.tvforgotpass);
        registerHere=findViewById(R.id.btnRegisterHere);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usermain="tech";
                String passmain="geeks";
                if((userName.getText().toString().equals(usermain))&&pass.getText().toString().equals(passmain)) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                   /* toast.show();*/

                    startActivity(intent);
                    finish();
                }
                else {

                    Toast.makeText(getApplicationContext(), "Please check your username and password", Toast.LENGTH_LONG).show();

                }
            }
        });


        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ForgotPassword.class);
                startActivity(intent);
            }
        });

        registerHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NewRegistration.class);
                startActivity(intent);
            }
        });


    }
}
