package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.azarnush.ptmalborz.Adapter.LawInfo2_adapter;
import com.azarnush.ptmalborz.App.AppController;
import com.azarnush.ptmalborz.models.LawInfo2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

public class Law_of_PossessionActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private LawInfo2_adapter adapter;
    public static ArrayList<LawInfo2> lawInfos2 = new ArrayList<>();
    Context context_lawinfo2;
    public static String lawContent;
    public static String lawTitle;
    public static String lawTag;
    public static String lawSummery;
     Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_of__possession);
        context_lawinfo2 = Law_of_PossessionActivity.this;

        realm = Realm.getDefaultInstance();
        Integer chekeRealm = realm.where(LawInfo2.class).findAll().size();
        All_lawsActivity a = new All_lawsActivity();


        if (chekeRealm == 0) {
            if (a.isConnected()) {
                sendJsonArrayRequest_lawsInfos2();
            } else
                Toast.makeText(getApplicationContext(), "لطفا اینترنت را روشن و دوباره امتحان کنید.", Toast.LENGTH_LONG).show();

        } else {
            readFromRealmDatabase();
        }

        recyclerView = findViewById(R.id.recycler_law_of_possession);
        adapter = new LawInfo2_adapter(lawInfos2, context_lawinfo2);

        recyclerView.setLayoutManager(new LinearLayoutManager(context_lawinfo2));
        recyclerView.setAdapter(adapter);
    }

    private void writeToRealmDatabase() {
        realm.beginTransaction();
        for (int i = 0; i < lawInfos2.size(); i++) {

            realm.copyToRealm(lawInfos2.get(i));
        }

        realm.commitTransaction();

    }

    private void readFromRealmDatabase() {
        lawInfos2.clear();
        RealmResults<LawInfo2> results = realm.where(LawInfo2.class).findAll();

        try {
            for (int i = 0; i < results.size(); i++) {

                LawInfo2 object = results.get(i);
                lawTitle = object.getLawTitle();
                lawSummery = object.getLawSummary();
                String lawId = "5";
                lawContent = object.getLawContent();
                String lawSourceLink = "";
                lawTag = object.getLawTag();
                String shortKey = "";
                String visibleStatusId = "1";
                String registerDate = "";
                String lawGroupRefId = "1";
                lawInfos2.add(new LawInfo2(lawId, lawTitle, lawSummery, lawContent, lawSourceLink, lawTag, shortKey, visibleStatusId, registerDate, lawGroupRefId));

            }
            adapter.notifyDataSetChanged();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void sendJsonArrayRequest_lawsInfos2() {
        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "http://api.webeskan.com/api/v1/laws/get-laws-by-group-id/2";

        Response.Listener<JSONArray> listener = new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {

                try {
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject object = response.getJSONObject(i);
                        lawTitle = object.getString("lawTitle");
                        String lawSummery = object.getString("lawSummary");
                        String lawId = "5";
                        lawContent = object.getString("lawContent");
                        String lawSourceLink = "";
                        lawTag = object.getString("lawTag");
                        String shortKey = "";
                        String visibleStatusId = "1";
                        String registerDate = "";
                        String lawGroupRefId = "1";

                        lawInfos2.add(new LawInfo2(lawId, lawTitle, lawSummery, lawContent,
                                lawSourceLink, lawTag, shortKey, visibleStatusId, registerDate, lawGroupRefId));
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

            }
        };

        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, listener, errorListener);
        queue.add(request);

    }

}
