package com.azarnush.ptmalborz.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.azarnush.ptmalborz.All_lawsActivity;
import com.azarnush.ptmalborz.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    Button btn_laws,btn_weblog;


    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

         View root = inflater.inflate(R.layout.fragment_home ,container, false);
         btn_laws = root.findViewById(R.id.btn_laws);
         btn_laws.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(getContext(), All_lawsActivity.class));
             }
         });

        return root;
    }

}