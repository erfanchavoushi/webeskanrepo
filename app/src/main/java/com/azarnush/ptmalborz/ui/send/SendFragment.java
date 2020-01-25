package com.azarnush.ptmalborz.ui.send;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SendFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        getActivity().finish();

        super.onAttach(context);
    }

}