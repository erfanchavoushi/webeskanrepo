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
import com.azarnush.ptmalborz.Adapter.Votes_adapter;

import com.azarnush.ptmalborz.models.LawInfo5;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class VotesActivity extends AppCompatActivity {
    RecyclerView Recycler_votes;
    private Votes_adapter adapter;
    public static ArrayList<LawInfo5> lawinfos5 = new ArrayList<>();
    Context context_VotesActivity;
    private Realm realm5;
    public static String lawContent5;
    public static String lawTitle5;
    public static String lawTag5;
    public static String lawSummery5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votes);
        context_VotesActivity = getApplicationContext();

        realm5 = Realm.getDefaultInstance();
        Integer chekeRealm = realm5.where(LawInfo5.class).findAll().size();
        All_lawsFragment a = new All_lawsFragment();

        if (chekeRealm == 0) {
            if (a.isConnected()) {
                sendJsonArrayRequest_lawsInfos5();
            } else
                Toast.makeText(this, "لطفا اینترنت را روشن و دوباره امتحان کنید.", Toast.LENGTH_LONG).show();

        } else {
            readFromRealmDatabase();

        }

        Recycler_votes = findViewById(R.id.recycler_votes);
        adapter = new Votes_adapter(lawinfos5, context_VotesActivity);
        Recycler_votes.setLayoutManager(new LinearLayoutManager(this));
        Recycler_votes.setAdapter(adapter);
    }

    private void writeToRealmDatabase() {
        realm5.beginTransaction();
        for (int i = 0; i < lawinfos5.size(); i++) {

            realm5.copyToRealm(lawinfos5.get(i));
        }
        realm5.commitTransaction();

    }

    private void readFromRealmDatabase() {
        lawinfos5.clear();
        RealmResults<LawInfo5> results = realm5.where(LawInfo5.class).findAll();

        try {
            for (int i = 0; i < results.size(); i++) {

                LawInfo5 object = results.get(i);
                lawTitle5 = object.getLawTitle();
                lawSummery5 = object.getLawSummary();
                String lawId = "5";
                lawContent5 = object.getLawContent();
                String lawSourceLink = "";
                lawTag5 = object.getLawTag();
                String shortKey = "";
                String visibleStatusId = "1";
                String registerDate = "";
                String lawGroupRefId = "1";
                lawinfos5.add(new LawInfo5(lawId, lawTitle5, lawSummery5, lawContent5, lawSourceLink,
                        lawTag5, shortKey, visibleStatusId, registerDate, lawGroupRefId));

            }
            adapter.notifyDataSetChanged();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void sendJsonArrayRequest_lawsInfos5() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://api.webeskan.com/api/v1/laws/get-laws-by-group-id/4";

        Response.Listener<JSONArray> listener = new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {

                try {
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject object = response.getJSONObject(i);
                        lawTitle5 = object.getString("lawTitle");
                        String lawSummery = object.getString("lawSummary");
                        String lawId = "5";
                        lawContent5 = object.getString("lawContent");
                        String lawSourceLink = "";
                        lawTag5 = object.getString("lawTag");
                        String shortKey = "";
                        String visibleStatusId = "1";
                        String registerDate = "";
                        String lawGroupRefId = "1";

                        lawinfos5.add(new LawInfo5(lawId, lawTitle5, lawSummery, lawContent5,
                                lawSourceLink, lawTag5, shortKey, visibleStatusId, registerDate, lawGroupRefId));

                    }
                    adapter.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                writeToRealmDatabase();
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context_VotesActivity, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        };

        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, listener, errorListener);
        queue.add(request);
    }
}
