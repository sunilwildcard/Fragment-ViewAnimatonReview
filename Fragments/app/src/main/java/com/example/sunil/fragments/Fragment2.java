package com.example.sunil.fragments;



import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sunil on 9/20/16.
 */

public class Fragment2 extends Fragment {

    private View view;
    private TextView textview;
    private String fromActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get Bundle from MainActivity
        fromActivity = getArguments().getString("CALLBACK");

        view = inflater.inflate(R.layout.layout2,container,false);

        textview = (TextView) view.findViewById(R.id.fragment2_textview);
        textview.setText(fromActivity);
        return view;
    }

    public void setTextView(String s){textview.setText(s);}
}
