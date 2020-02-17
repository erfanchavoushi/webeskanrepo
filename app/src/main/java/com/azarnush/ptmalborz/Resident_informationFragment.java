package com.azarnush.ptmalborz;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Resident_informationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_resident_information, container, false);
        HomeActivity.toolbar.setTitle("ثبت نام");

        return root;

    }

    @Override
    public void onResume() {
        super.onResume();
        HomeActivity.toolbar.setTitle("ثبت نام");
    }
}
