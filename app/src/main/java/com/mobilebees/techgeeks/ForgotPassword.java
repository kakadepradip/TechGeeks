package com.mobilebees.techgeeks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    EditText editTextNickName;
    Button buttonConfirmNickName, buttonLogin, buttonRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        editTextNickName=findViewById(R.id.edittextNickName);
        buttonConfirmNickName=findViewById(R.id.btnForgotPassNickName);
        buttonLogin=findViewById(R.id.btnFPLogIn);
        buttonRegistration=findViewById(R.id.btnFPRegistration);

        buttonConfirmNickName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextNickName.getText().toString().equals("tech"))
                {
                    Toast.makeText(getApplicationContext(),"Change Your Password",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(ForgotPassword.this,ChangePassword.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Enter Valid Nick Name",Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgotPassword.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgotPassword.this,NewRegistration.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
