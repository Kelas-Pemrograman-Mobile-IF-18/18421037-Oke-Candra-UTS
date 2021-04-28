package com.chandra.aplikasipenjualansepatu.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chandra.aplikasipenjualansepatu.R;
import com.chandra.aplikasipenjualansepatu.users.Login;
import com.chandra.aplikasipenjualansepatu.users.Registrasi;
import com.ornach.nobobutton.NoboButton;

public class Admin extends AppCompatActivity {
    ImageView keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        keluar = (ImageView) findViewById(R.id.keluar);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Admin.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}