package com.example.sunil.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by sunil on 9/20/16.
 */

public class Fragment1 extends Fragment implements View.OnClickListener {

    private View view;
    private Button mButton;
    private EditText mEditText;

    private static OnFragmentButtonClickListener mListener;

    /*
    Called when you add the fragment to the FragmentManager:
    onAttach, onCreate, onCreateView,

    Called after hosting Activity's onCreate():
    onActivityCreated, onStart, onResume
    onPause onStop onDestroyView onDestroy onDetach
    */


    public static Fragment1 newInstance(OnFragmentButtonClickListener listener){
        mListener = listener;
        return new Fragment1();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Get a reference to the interface implementation
        try {
            if (context instanceof Activity)
                mListener = (OnFragmentButtonClickListener) context;
        } catch (ClassCastException ex){
            throw new ClassCastException(context.getApplicationContext().toString());
        }
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.layout1,container,false);

        mButton = (Button) view.findViewById(R.id.frag1_button);

        mEditText = (EditText) view.findViewById(R.id.frag1_edittext);
        mButton.setOnClickListener(this);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.frag1_button:
                if(mListener!=null)
                    mListener.getTextFromTextView(mEditText.getText().toString());
                break;
        }
    }

    public interface OnFragmentButtonClickListener{
        public void getTextFromTextView(String message);
    }

}
