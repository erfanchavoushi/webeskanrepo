package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.hendraanggrian.appcompat.widget.PinGroup;

import org.json.JSONException;
import org.json.JSONObject;

public class Login_with_number extends AppCompatActivity {
    PinGroup pinGroup;
    Button btn_login_with_number;
    TextView txt_Counter;
    public int counter = 30;
    String register_cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_number);


        pinGroup = findViewById(R.id.pinGroup);
        btn_login_with_number = findViewById(R.id.login);
        txt_Counter = findViewById(R.id.txt_Counter);

        btn_login_with_number.setText("تایید");
        count();


        register_cod = getIntent().getStringExtra("code");

        pinGroup.setText(register_cod);

        btn_login_with_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn_login_with_number.getText() == "تایید" || btn_login_with_number.getText() == "ارسال مجدد کد") {

                    if (btn_login_with_number.getText() == "ارسال مجدد کد") {
                        sendJsonObjectRequest_codRegister();
                    } else {
                        String user_cod = (String) pinGroup.getText();
                        if (register_cod.equalsIgnoreCase(user_cod)) {
                            if (counter != 0) {
                                Get_number_manager.isRegister = "true";
                                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(i);
                            } else
                                Toast.makeText(getApplicationContext(), "زمان شما تمام شد", Toast.LENGTH_LONG).show();


                        } else {
                            Toast.makeText(getApplicationContext(), "کد ارسالی شما اشتباه می باشد", Toast.LENGTH_LONG).show();

                        }
                    }


                } else {


                    sendJsonObjectRequest_codRegister();
                    btn_login_with_number.setText("تایید");
                    counter = 30;
                }

            }
        });


    }

    //Seconds build
    public void count() {
        new CountDownTimer(1000000, 1000) {
            public void onTick(long millisUntilFinished) {
                txt_Counter.setText(String.valueOf(counter));
                if (counter != 0) {
                    counter--;

                } else {
                    btn_login_with_number.setText("ارسال مجدد کد");
                    pinGroup.setText("0000");

                }
            }

            public void onFinish() {
                counter = 30;


            }
        }.start();
    }

    //Get  again the registration code
    public void sendJsonObjectRequest_codRegister() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = Get_number_manager.url_Foundation + "generate-user-code/" + Get_number_manager.mobile_number;

        Response.Listener<JSONObject> listener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {

                    register_cod = response.getString("item2");
                    pinGroup.setText(register_cod);
                    counter = 30;

                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
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
