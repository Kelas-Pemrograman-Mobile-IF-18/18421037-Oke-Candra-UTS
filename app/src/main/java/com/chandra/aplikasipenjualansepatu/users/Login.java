package com.chandra.aplikasipenjualansepatu.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chandra.aplikasipenjualansepatu.R;
import com.chandra.aplikasipenjualansepatu.admin.Admin;
import com.ornach.nobobutton.NoboButton;

public class Login extends AppCompatActivity {
    NoboButton BtnRegistrasi, BtnLogin;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            getSupportActionBar().hide();

            BtnRegistrasi = (NoboButton) findViewById(R.id.BtnRegistrasi);
            BtnLogin = (NoboButton) findViewById(R.id.BtnLogin);

            BtnRegistrasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Login.this, Registrasi.class);
                    startActivity(i);
                    finish();
                }
            });

            BtnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Login.this, Admin.class);
                    startActivity(i);
                    finish();
                }
            });
        }
}