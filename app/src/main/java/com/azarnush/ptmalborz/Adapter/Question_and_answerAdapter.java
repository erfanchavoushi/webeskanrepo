package com.azarnush.ptmalborz.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.azarnush.ptmalborz.HomeActivity;
import com.azarnush.ptmalborz.LawContent3Fragment;
import com.azarnush.ptmalborz.LawContent7Fragment;
import com.azarnush.ptmalborz.LawContent8Fragment;
import com.azarnush.ptmalborz.R;
import com.azarnush.ptmalborz.models.LawInfo4;

import java.util.List;

public class Question_and_answerAdapter extends
        RecyclerView.Adapter<Question_and_answerAdapter.Question_and_answerAdapter_ViewHolder>{

    private List<LawInfo4> lawinfos4;
    private Context mContext;


    public Question_and_answerAdapter(List<LawInfo4> lawinfos4, Context mContext) {
        this.lawinfos4 = lawinfos4;
        this.mContext = mContext;
    }

    @Override
    public Question_and_answerAdapter.Question_and_answerAdapter_ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reguration_list_row, parent, false);
        return new Question_and_answerAdapter.Question_and_answerAdapter_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Question_and_answerAdapter.Question_and_answerAdapter_ViewHolder holder, final int position) {
        LawInfo4 lawinfo4 = lawinfos4.get(position);

        holder.txt_title.setText(lawinfo4.getLawTitle());
        holder.txt_lawsummary.setText(lawinfo4.getLawSummary());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (position){
                    case 0 :

                        Fragment fragment = new LawContent3Fragment();
                        HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
                        break;
                    case 1:
                        fragment = new LawContent7Fragment();
                        HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
                        break;
                    case 2:
                        fragment = new LawContent8Fragment();
                        HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {

        return lawinfos4.size();
    }

    public class Question_and_answerAdapter_ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView txt_title;
        private TextView txt_lawsummary;

        private Question_and_answerAdapter_ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.crd_view_lawinfo2);

            txt_title = itemView.findViewById(R.id.txt_title);
            txt_lawsummary = itemView.findViewById(R.id.txt_lawsummary);

        }
    }
}
