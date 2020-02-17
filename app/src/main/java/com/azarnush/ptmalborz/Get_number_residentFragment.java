package com.azarnush.ptmalborz;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class Get_number_residentFragment extends Fragment {
    View root;
    EditText phone;
    Button btn_login;
    Integer number_number = 11;

    public static String isRegister;
    public static String mobile_number;
    public static String url_Foundation = "http://api.webeskan.com/api/v1/users/";
    public static String codRegister;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_get_number_resident, container, false);


        phone = root.findViewById(R.id.phone);
        btn_login = root.findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get mobile number from view
                mobile_number = phone.getText().toString();

                if (mobile_number.equals("")) {

                    Toast.makeText(getContext(), "لطفا شماره را وارد نمایید", Toast.LENGTH_LONG).show();

                } else if (mobile_number.length() < number_number) {
                    Toast.makeText(getContext(), "تعداد ارقام کافی نیست", Toast.LENGTH_LONG).show();
                } else if (!mobile_number.matches("(\\+98|0)?9\\d{9}")) {

                    Toast.makeText(getContext(), "شماره موبایل نامعتبر هست", Toast.LENGTH_SHORT).show();
                } else {

                    sendJsonObjectRequest2();

                }


            }
        });

        return root;
    }

    //get isRegister and codRegister
    public void sendJsonObjectRequest2() {
        RequestQueue queue = Volley.newRequestQueue(getContext());
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

                    Intent i = new Intent(getContext(), Login_with_number.class);
                    i.putExtra("code", codRegister);
                    startActivity(i);
                } else {

                    Intent i = new Intent(getContext(), User_registrationActivity.class);
                    i.putExtra("number", mobile_number);
                    startActivity(i);

                }
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_LONG).show();

            }
        };

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, listener, errorListener);
        queue.add(request);
    }
}
