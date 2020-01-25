package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class All_lawsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_LawOfPossession, btn_Regulations, btn_question_and_answer, btn_votes, btn_Rules_webeskan;
   public static boolean connected ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_laws);

        findViews();
        btn_LawOfPossession.setOnClickListener(this);
        btn_Regulations.setOnClickListener(this);
        btn_question_and_answer.setOnClickListener(this);
        btn_votes.setOnClickListener(this);
        btn_Rules_webeskan.setOnClickListener(this);
        isConnected();

        if (Prefs.with(this).isFirstLoad() && (connected == false)) {

            Toast.makeText(getApplicationContext(), "لطفا اینترنت را فقط برای بار اول روشن کنید.", Toast.LENGTH_LONG).show();
            finish();
        }
        if(connected == true){
            Prefs.with(this).firstLoadIsDone();
        }
    }

    public boolean isConnected() {

        try {
            ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

        } catch (Exception e) {
           // Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG);

        }
        return connected;
    }

    public void findViews() {
        btn_LawOfPossession = findViewById(R.id.btn_LawOfPossession);
        btn_Regulations = findViewById(R.id.btn_Regulations);
        btn_question_and_answer = findViewById(R.id.btn_question_and_answer);
        btn_votes = findViewById(R.id.btn_votes);
        btn_Rules_webeskan = findViewById(R.id.btn_Rules_webeskan);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_LawOfPossession:
                startActivity(new Intent(All_lawsActivity.this, Law_of_PossessionActivity.class));
                break;
            case R.id.btn_Regulations:
                startActivity(new Intent(All_lawsActivity.this, RegulationsActivity.class));
                break;
            case R.id.btn_question_and_answer:
                startActivity(new Intent(All_lawsActivity.this, Question_and_answerActivity.class));
                break;
            case R.id.btn_votes:
                startActivity(new Intent(All_lawsActivity.this, VotesActivity.class));
                break;
            case R.id.btn_Rules_webeskan:
                startActivity(new Intent(All_lawsActivity.this, Rules_webeskanActivity.class));
                break;

        }

    }


}
