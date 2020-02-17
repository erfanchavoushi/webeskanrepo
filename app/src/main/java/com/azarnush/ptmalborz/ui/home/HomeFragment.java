package com.azarnush.ptmalborz.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.azarnush.ptmalborz.All_lawsFragment;
import com.azarnush.ptmalborz.HomeActivity;
import com.azarnush.ptmalborz.R;
import com.azarnush.ptmalborz.Resident_informationFragment;
import com.azarnush.ptmalborz.Saken_Login_Fragment;
import com.azarnush.ptmalborz.WebLogFragment;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    Button btn_laws, btn_weblog, btn_residents_login, btn_managers_login;

    Context context_home;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

         View root = inflater.inflate(R.layout.fragment_home ,container, false);
         context_home = root.getContext();

         btn_laws = root.findViewById(R.id.btn_laws);
        btn_weblog = root.findViewById(R.id.btn_weblog);
        btn_residents_login = root.findViewById(R.id.btn_Residents_login);
        btn_managers_login = root.findViewById(R.id.btn_managers_login);



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

        btn_residents_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new Saken_Login_Fragment();
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).addToBackStack(null).commit();
            }
        });


        return root;
    }

    @Override
    public void onPause() {
        super.onPause();
        HomeActivity.imageShare.setVisibility(View.INVISIBLE);
        //Toast.makeText(getActivity() , "on pause",  Toast.LENGTH_LONG);

    }

    @Override
  public void onResume() {
        super.onResume();
        HomeActivity. imageShare.setVisibility(View.INVISIBLE);
        Toast.makeText(getActivity() , "on resume",  Toast.LENGTH_LONG);
       HomeActivity.toolbar.setTitle("صفحه اصلی");

    }
    
}