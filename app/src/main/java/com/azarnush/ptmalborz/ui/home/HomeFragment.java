package com.azarnush.ptmalborz.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.azarnush.ptmalborz.All_lawsFragment;
import com.azarnush.ptmalborz.HomeActivity;
import com.azarnush.ptmalborz.R;
import com.azarnush.ptmalborz.WebLogFragment;

public class HomeFragment extends Fragment {
   public static String Current_fragment;

    private HomeViewModel homeViewModel;

    Button btn_laws,btn_weblog;

    Context context_home;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

         View root = inflater.inflate(R.layout.fragment_home ,container, false);
         context_home = root.getContext();
        HomeActivity.toolbar.setTitle("صحفه اصلی");
         btn_laws = root.findViewById(R.id.btn_laws);
        btn_weblog = root.findViewById(R.id.btn_weblog);
         btn_laws.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Fragment fragment = new All_lawsFragment();
                 HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).addToBackStack(null).commit();


             }
         });

         btn_weblog.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Fragment fragment = new WebLogFragment();
                 HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).addToBackStack(null).commit();
             }
         });


        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        HomeActivity.toolbar.setTitle("صحفه اصلی");
    }
    
}