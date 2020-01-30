package com.azarnush.ptmalborz.Adapter;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.azarnush.ptmalborz.LawContent2Fragment;
import com.azarnush.ptmalborz.R;
import com.azarnush.ptmalborz.models.LawInfo5;


import java.util.ArrayList;
import java.util.List;

public class Votes_adapter extends RecyclerView.Adapter<Votes_adapter.Votes_ViewHolder> {

    private List<LawInfo5> lawinfos5;
    private Context mContext;


    public Votes_adapter(ArrayList<LawInfo5> lawinfos5, Context mContext) {
        this.lawinfos5 = lawinfos5;
        this.mContext = mContext;
    }

    @Override
    public Votes_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reguration_list_row, parent, false);
        return new Votes_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Votes_adapter.Votes_ViewHolder holder,
                                 final int position) {
        LawInfo5 lawinfo5 = lawinfos5.get(position);

        holder.txt_title.setText(lawinfo5.getLawTitle());
        holder.txt_lawsummary.setText(lawinfo5.getLawSummary());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent texts = new Intent(view.getContext(), LawContent2Fragment.class);
                switch (position) {
                    case 0:
                        texts.putExtra("number_page", "4.0");
                        view.getContext().startActivity(texts);
                        break;
                    case 1:
                        texts.putExtra("number_page", "4.1");
                        view.getContext().startActivity(texts);
                        break;

                }
            }
        });

    }

    @Override
    public int getItemCount() {

        return lawinfos5.size();
    }

    public class Votes_ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView txt_title;
        private TextView txt_lawsummary;

        private Votes_ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.crd_view_lawinfo2);

            txt_title = itemView.findViewById(R.id.txt_title);
            txt_lawsummary = itemView.findViewById(R.id.txt_lawsummary);

        }
    }
}
