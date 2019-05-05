package com.mobilebees.techgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewRegistration extends AppCompatActivity {

    EditText etName,etMobileno,etEmail,etPass,etNickName;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_registration);
    etName=findViewById(R.id.etNewName);
    etMobileno=findViewById(R.id.etNewMobileNo);
    etEmail=findViewById(R.id.etNewEmail);
    etPass=findViewById(R.id.etnewPassword);
    etNickName=findViewById(R.id.etNewNickName);

    buttonRegister=findViewById(R.id.btnNewRegister);

    String newName,newMobile,newEmail,newPass,newNick;
    newName=etName.getText().toString();        newMobile=etMobileno.getText().toString();
    newEmail=etEmail.getText().toString();      newPass=etPass.getText().toString();
    newNick=etNickName.getText().toString();


    buttonRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"Registration Successful... :)",Toast.LENGTH_LONG).show();
            finish();
        }
    });

    }
}
