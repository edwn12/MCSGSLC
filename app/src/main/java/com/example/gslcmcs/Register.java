package com.example.gslcmcs;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Register  extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText confirm;
    EditText register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("123456") && confirm.getText().toString().equals("123456"){
                    Toast.makeText(Register.this, "Register Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Register.this, "Register Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
