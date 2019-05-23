/* NIM : 10116289 */
/* Nama : Muhammad Qais Abdurrahim */
/* Kelas : IF-7 */
/* Dibuat : 23-05-2019 */

package com.example.utsakb.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.utsakb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProfil extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_fragment_profil, container, false);

        return view;
    }


}