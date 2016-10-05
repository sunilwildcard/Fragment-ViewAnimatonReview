package com.example.sunil.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sunil on 9/24/16.
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {

    private Fragment1.OnFragmentButtonClickListener mListener;

    public CustomPagerAdapter(FragmentManager fm, Fragment1.OnFragmentButtonClickListener listener) {
        super(fm);
        mListener = listener;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
        // should return new fragment here, but I don't know what fragment
        // This adapter takes an interface reference, so we can pass it to
        // the fragment here
        // get a fragment, pass the position and implementation reference to it

    }

    @Override
    public int getCount() {
        // return the amount of pages you want
        return 0;
    }
}
