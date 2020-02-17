package com.azarnush.ptmalborz;

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

public class Saken_Login_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_saken_login, container, false);
        HomeActivity.toolbar.setTitle("ورود ساکنین");

        Button btn_register = root.findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new Get_number_residentFragment();
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).addToBackStack(null).commit();
            }
        });


        return root;
    }


    @Override
    public void onResume() {
        super.onResume();
        HomeActivity.toolbar.setTitle("ورود ساکنین");

    }

}