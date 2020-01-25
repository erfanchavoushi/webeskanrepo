package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class User_registrationActivity extends AppCompatActivity {
    EditText edt_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        edt_number = findViewById(R.id.edt_number);

        String number = getIntent().getStringExtra("number");
        edt_number.setText(number);
    }
}
