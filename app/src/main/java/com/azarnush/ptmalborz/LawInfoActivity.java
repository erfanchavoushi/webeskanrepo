package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.azarnush.ptmalborz.Adapter.LawInfo_adapter;
import com.azarnush.ptmalborz.models.LawInfo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class LawInfoActivity extends AppCompatActivity {


    RecyclerView recyclerViewinfo;
    private LawInfo_adapter adapter;
    private ArrayList<LawInfo> lawInfos = new ArrayList<>();
    Context context_lawinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_info);

        sendJsonArrayRequest_lawsInfos();

        context_lawinfo = getApplicationContext();

        recyclerViewinfo = findViewById(R.id.recycler_lawinfo);
        adapter = new LawInfo_adapter(lawInfos, context_lawinfo);

        recyclerViewinfo.setLayoutManager(new LinearLayoutManager(context_lawinfo));
        recyclerViewinfo.setAdapter(adapter);

    }

    public void sendJsonArrayRequest_lawsInfos() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://api.webeskan.com/api/v1/laws/get-laws-by-group-id/1";

        Response.Listener<JSONArray> listener = new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {

                try {
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject object = response.getJSONObject(i);
                        String lawTitle = object.getString("lawTitle");
                        String lawSummery = object.getString("lawSummary");
                        String lawId = "5";
                        String lawContent = "";
                        String lawSourceLink = "";
                        String lawTag = "";
                        String shortKey = "";
                        String visibleStatusId = "1";
                        String registerDate = "";
                        String lawGroupRefId = "1";

                        lawInfos.add(new LawInfo(lawId, lawTitle, lawSummery, lawContent, lawSourceLink, lawTag, shortKey, visibleStatusId, registerDate, lawGroupRefId));

                        adapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context_lawinfo, error.getMessage(), Toast.LENGTH_LONG).show();

            }
        };

        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, listener, errorListener);
        queue.add(request);

    }

}