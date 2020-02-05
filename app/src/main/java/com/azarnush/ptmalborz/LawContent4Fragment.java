package com.azarnush.ptmalborz;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.azarnush.ptmalborz.models.LawInfo5;

public class LawContent4Fragment extends Fragment {

    TextView txt_content;
    TextView txt_law_title;
    TextView txt_law_taq;

    String my_text = "";

    Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_law_content, container, false);

        context = root.getContext();

        txt_content = root.findViewById(R.id.txt_content);
        txt_law_title = root.findViewById(R.id.txt_law_title);
        txt_law_taq = root.findViewById(R.id.txt_law_taq);


        LawInfo5 lawInfo55 = VotesFragment.lawinfos5.get(0);
        txt_law_title.setText(lawInfo55.getLawTitle());
        txt_content.setText(Html.fromHtml(lawInfo55.getLawContent()));
        my_text = lawInfo55.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo55.getLawContent());
        if (lawInfo55.getLawTag().equalsIgnoreCase("null")){
            txt_law_taq.setText("");
        } else txt_law_taq.setText(lawInfo55.getLawTag());


        return root;
    }
}
