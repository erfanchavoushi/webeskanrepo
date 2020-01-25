package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Building_managers, Arrival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Get_number.isRegister =="true") {
            Toast.makeText(this ,Get_number.isRegister ,Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,HomeActivity.class));
            finish();

        }else {
            setContentView(R.layout.activity_main);
            init();


            Building_managers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this , Logonـtypeـselection.class));
                }
            });
        }


    }

    public void init(){
        Building_managers= findViewById(R.id.Building_managers);
        Arrival = findViewById(R.id.Arrival);
    }
}
