package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logonـtypeـselection extends AppCompatActivity {
    Button btn_Loginـwithـnumber , btn_login_with_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon_type_selection);

        btn_Loginـwithـnumber = findViewById(R.id.btn_Loginـwithـnumber);
        btn_login_with_name = findViewById(R.id.btn_login_with_name);


        btn_Loginـwithـnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Logonـtypeـselection.this, Get_number_manager.class));
            }
        });


    }
}
