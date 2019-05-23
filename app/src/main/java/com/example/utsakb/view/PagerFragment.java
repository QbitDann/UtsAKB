/* NIM : 10116289 */
/* Nama : Muhammad Qais Abdurrahim */
/* Kelas : IF-7 */
/* Dibuat : 23-05-2019 */

package com.example.utsakb.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utsakb.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFragment extends Fragment {


    private TextView textView;
    public PagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        textView = view.findViewById(R.id.teks_fragment);
                String message = getArguments().getString("message");
        textView.setText(message);
        return view;
    }

}
