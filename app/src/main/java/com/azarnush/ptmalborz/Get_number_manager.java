package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Get_number_manager extends AppCompatActivity {
    EditText phone;
    Button btn_login;
    Integer number_number = 11;
    TextView txt_Register;
    public static String isRegister ;
    public static String mobile_number;
    public static String url_Foundation = "http://api.webeskan.com/api/v1/users/";
    public static String codRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_number);


        phone = findViewById(R.id.phone);
        btn_login = findViewById(R.id.btn_login);
        txt_Register = findViewById(R.id.txt_Register);

        txt_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), User_registrationActivity.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get mobile number from view
                mobile_number = phone.getText().toString();

                if (mobile_number.equals("")) {

                    Toast.makeText(getApplicationContext(), "لطفا شماره را وارد نمایید", Toast.LENGTH_LONG).show();

                } else if (mobile_number.length() < number_number) {
                    Toast.makeText(getApplicationContext(), "تعداد ارقام کافی نیست", Toast.LENGTH_LONG).show();
                } else if (!mobile_number.matches("(\\+98|0)?9\\d{9}")) {

                    Toast.makeText(Get_number_manager.this, "شماره موبایل نامعتبر هست", Toast.LENGTH_SHORT).show();
                } else {

                    sendJsonObjectRequest2();

                }
            }
        });

    }
    //get isRegister and codRegister
    public void sendJsonObjectRequest2() {
        RequestQueue queue = Volley.newRequestQueue(getBaseContext());
        String url = url_Foundation + "generate-user-code/" + mobile_number;


        Response.Listener<JSONObject> listener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    isRegister = response.getString("item1");
                    codRegister = response.getString("item2");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (isRegister == "true") {

                    Intent i = new Intent(getApplicationContext(), Login_with_number.class);
                    i.putExtra("code", codRegister);


                    startActivity(i);
                } else {

                    Intent i = new Intent(getApplicationContext(), User_registrationActivity.class);
                    i.putExtra("number", mobile_number);
                    startActivity(i);

                }
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();

            }
        };

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, listener, errorListener);
        queue.add(request);
    }
}
