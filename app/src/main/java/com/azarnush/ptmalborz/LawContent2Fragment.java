package com.azarnush.ptmalborz;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.azarnush.ptmalborz.models.LawInfo3;

public class LawContent2Fragment extends Fragment {
    TextView txt_content;
    TextView txt_law_title;
    TextView txt_law_taq;

    String my_text = "";
    View root;
    Context context;

    public LawContent2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_law_content, container, false);
        context = root.getContext();

        txt_content = root.findViewById(R.id.txt_content);
        txt_law_title = root.findViewById(R.id.txt_law_title);
        txt_law_taq = root.findViewById(R.id.txt_law_taq);
        LawInfo3 lawInfo33 = RegulationsFragment.lawinfos3.get(0);
        txt_law_title.setText(lawInfo33.getLawTitle());
        txt_content.setText(Html.fromHtml(lawInfo33.getLawContent()));
        my_text = lawInfo33.getLawTitle() + " \n\n" + Html.fromHtml(lawInfo33.getLawContent());
        if (lawInfo33.getLawTag().equalsIgnoreCase("null")) {
            txt_law_taq.setText("");
        } else txt_law_taq.setText(lawInfo33.getLawTag());

        return root;

    }

}
