package com.example.utsakb.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.utsakb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKontak extends Fragment {


    public FragmentKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_kontak, container, false);
    }

}
