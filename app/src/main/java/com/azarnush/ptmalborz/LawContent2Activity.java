package com.azarnush.ptmalborz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.azarnush.ptmalborz.models.LawInfo2;
import com.azarnush.ptmalborz.models.LawInfo3;
import com.azarnush.ptmalborz.models.LawInfo4;
import com.azarnush.ptmalborz.models.LawInfo5;
import com.azarnush.ptmalborz.models.LawInfo6;

public class LawContent2Activity extends AppCompatActivity {
    TextView txt_content;
    TextView txt_law_title;
    TextView txt_law_taq;
    String number_page = "";

    String my_text = "";

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_content2);

        txt_content = findViewById(R.id.txt_content);
        txt_law_title = findViewById(R.id.txt_law_title);
        txt_law_taq = findViewById(R.id.txt_law_taq);

        number_page = getIntent().getExtras().getString("number_page");


        switch (number_page) {
            case "1.0":
                LawInfo2 lawInfo22 = Law_of_PossessionActivity.lawInfos2.get(0);
                txt_law_title.setText(lawInfo22.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo22.getLawContent()));
                my_text = lawInfo22.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo22.getLawContent());
                if (lawInfo22.getLawTag().equalsIgnoreCase("null")) {
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo22.getLawTag());

                break;
            case "2.0":
                LawInfo3 lawInfo33 = RegulationsActivity.lawinfos.get(0);
                txt_law_title.setText(lawInfo33.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo33.getLawContent()));
                my_text = lawInfo33.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo33.getLawContent());
                if (lawInfo33.getLawTag().equalsIgnoreCase("null")){
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo33.getLawTag());

                break;
            case "3.0":
                LawInfo4 lawInfo44 = Question_and_answerActivity.lawinfos4.get(0);
                txt_law_title.setText(lawInfo44.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo44.getLawContent()));
                my_text = lawInfo44.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo44.getLawContent());
                if (lawInfo44.getLawTag().equalsIgnoreCase("null")) {
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo44.getLawTag());

                break;
            case "3.1":
                LawInfo4 lawInfo444 = Question_and_answerActivity.lawinfos4.get(1);
                txt_law_title.setText(lawInfo444.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo444.getLawContent()));
                my_text = lawInfo444.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo444.getLawContent());
                if (lawInfo444.getLawTag().equalsIgnoreCase("null")){
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo444.getLawTag());

                break;
            case "3.2":
                LawInfo4 lawInfo4444 = Question_and_answerActivity.lawinfos4.get(2);
                txt_law_title.setText(lawInfo4444.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo4444.getLawContent()));
                my_text = lawInfo4444.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo4444.getLawContent());
                if (lawInfo4444.getLawTag().equalsIgnoreCase("null")) {
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo4444.getLawTag());

                break;
            case "4.0":
                LawInfo5 lawInfo55 = VotesActivity.lawinfos5.get(0);
                txt_law_title.setText(lawInfo55.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo55.getLawContent()));
                my_text = lawInfo55.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo55.getLawContent());
                if (lawInfo55.getLawTag().equalsIgnoreCase("null")){
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo55.getLawTag());

                break;
            case "4.1":
                LawInfo5 lawInfo555 = VotesActivity.lawinfos5.get(1);
                txt_law_title.setText(lawInfo555.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo555.getLawContent()));
                my_text = lawInfo555.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo555.getLawContent());
                if (lawInfo555.getLawTag().equalsIgnoreCase("null")) {
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo555.getLawTag());

                break;
            case "5.0":
                LawInfo6 lawInfo6666 = Rules_webeskanActivity.lawinfos6.get(0);
                txt_law_title.setText(lawInfo6666.getLawTitle());
                txt_content.setText(Html.fromHtml(lawInfo6666.getLawContent()));
                my_text = lawInfo6666.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo6666.getLawContent());
                if (lawInfo6666.getLawTag().equalsIgnoreCase("null")) {
                    txt_law_taq.setText("");
                } else txt_law_taq.setText(lawInfo6666.getLawTag());

                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.action_share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, my_text);
                startActivity(Intent.createChooser(intent, "اشتراک گذاری متن با "));

                break;

        }
        return true;
    }
}