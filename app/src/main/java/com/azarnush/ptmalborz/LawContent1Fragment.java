package com.azarnush.ptmalborz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.azarnush.ptmalborz.models.LawInfo2;

public class LawContent1Fragment extends Fragment {
    TextView txt_content;
    TextView txt_law_title;
    TextView txt_law_taq;
    String my_text = "";

    View root;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_law_content, container, false);
        context = root.getContext();

        txt_content = root.findViewById(R.id.txt_content);
        txt_law_title = root.findViewById(R.id.txt_law_title);
        txt_law_taq = root.findViewById(R.id.txt_law_taq);





        LawInfo2 lawInfo22 = Law_of_PossessionFragment.lawInfos2.get(0);
        txt_law_title.setText(lawInfo22.getLawTitle());
        txt_content.setText(Html.fromHtml(lawInfo22.getLawContent()));
       my_text = lawInfo22.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo22.getLawContent());
        if (lawInfo22.getLawTag().equalsIgnoreCase("null")) {
            txt_law_taq.setText("");
        } else txt_law_taq.setText(lawInfo22.getLawTag());

        HomeActivity.imageShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, my_text);
                startActivity(Intent.createChooser(intent, "اشتراک گذاری متن با "));
            }
        });







//            case "3.0":
//                LawInfo4 lawInfo44 = Question_and_answerActivity.lawinfos4.get(0);
//                txt_law_title.setText(lawInfo44.getLawTitle());
//                txt_content.setText(Html.fromHtml(lawInfo44.getLawContent()));
//                my_text = lawInfo44.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo44.getLawContent());
//                if (lawInfo44.getLawTag().equalsIgnoreCase("null")) {
//                    txt_law_taq.setText("");
//                } else txt_law_taq.setText(lawInfo44.getLawTag());
//
//                break;
//            case "3.1":
//                LawInfo4 lawInfo444 = Question_and_answerActivity.lawinfos4.get(1);
//                txt_law_title.setText(lawInfo444.getLawTitle());
//                txt_content.setText(Html.fromHtml(lawInfo444.getLawContent()));
//                my_text = lawInfo444.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo444.getLawContent());
//                if (lawInfo444.getLawTag().equalsIgnoreCase("null")){
//                    txt_law_taq.setText("");
//                } else txt_law_taq.setText(lawInfo444.getLawTag());
//
//                break;
//            case "3.2":
//                LawInfo4 lawInfo4444 = Question_and_answerActivity.lawinfos4.get(2);
//                txt_law_title.setText(lawInfo4444.getLawTitle());
//                txt_content.setText(Html.fromHtml(lawInfo4444.getLawContent()));
//                my_text = lawInfo4444.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo4444.getLawContent());
//                if (lawInfo4444.getLawTag().equalsIgnoreCase("null")) {
//                    txt_law_taq.setText("");
//                } else txt_law_taq.setText(lawInfo4444.getLawTag());
//
//                break;

        return root;

    }

    @Override
    public void onPause() {
        super.onPause();
        HomeActivity.imageShare.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onResume() {
        super.onResume();
       HomeActivity.imageShare.setVisibility(View.VISIBLE);
    }

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater=getActivity().getMenuInflater();
//
//        inflater.inflate(R.menu.home, menu);
//        return true;
//
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch(item.getItemId())
//        {
//            case R.id.action_share:
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_TEXT, "my_text");
//                startActivity(Intent.createChooser(intent, "اشتراک گذاری متن با "));
//
//                break;
//
//        }
//        return true;
//    }




}
