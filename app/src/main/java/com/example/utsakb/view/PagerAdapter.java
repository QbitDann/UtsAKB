/* NIM : 10116289 */
/* Nama : Muhammad Qais Abdurrahim */
/* Kelas : IF-7 */
/* Dibuat : 23-05-2019 */

package com.example.utsakb.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        PagerFragment pagerFragment = new PagerFragment();
        Bundle bundle = new Bundle();
        i = i+1;
        bundle.putString("message","Selamat Datang, Aplikasi ini Dibuat Untuk Memenuhi UTS Mata Kuliah AKB");
        pagerFragment.setArguments(bundle);
        return pagerFragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
