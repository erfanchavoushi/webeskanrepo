package com.azarnush.ptmalborz.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import com.azarnush.ptmalborz.All_lawsFragment;
import com.azarnush.ptmalborz.R;
import com.azarnush.ptmalborz.WebLogFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    Button btn_laws,btn_weblog;

    Context context;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

         View root = inflater.inflate(R.layout.fragment_home ,container, false);
         context = root.getContext();

         btn_laws = root.findViewById(R.id.btn_laws);
        btn_weblog = root.findViewById(R.id.btn_weblog);
         btn_laws.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Fragment fragment = new All_lawsFragment();
                 FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                 fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
             }
         });

         btn_weblog.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Fragment fragment = new WebLogFragment();
                 FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                 fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit();
             }
         });

        return root;
    }

}