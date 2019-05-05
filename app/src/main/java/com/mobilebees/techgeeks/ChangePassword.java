package com.mobilebees.techgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePassword extends AppCompatActivity {

    EditText editTextNewpass, editTextConfirmPass;
    Button btnChangePass;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        editTextNewpass=findViewById(R.id.etchNewPass);
        editTextConfirmPass=findViewById(R.id.etchConfirmPass);

        btnChangePass=findViewById(R.id.btnchChangePass);
        String pass1=editTextNewpass.getText().toString();
        String pass2=editTextConfirmPass.getText().toString();


        btnChangePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextNewpass.getText().toString().equals(editTextConfirmPass.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Password Updated Successfully...",Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Check Your Password...",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
