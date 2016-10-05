package com.example.sunil.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentButtonClickListener {

    private String fragment1String;
    private boolean mShowingBack;

    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // i can call methods in a fragment with: findFragmentById() or findFragmentByTag()

        // this wasn't necessary with the "class" xml tag
        if(fragment1==null)
            fragment1 = new Fragment1(); //fragment1 = fragment1.newInstance(this);

        if(fragment2==null)
            fragment2 = new Fragment2();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,fragment1).commit();
    }

    @Override
    public void getTextFromTextView(String message) {
        fragment1String = message;
        Bundle bundle = new Bundle();
        bundle.putString("CALLBACK", fragment1String);
        fragment2.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.fragin,
                        R.anim.fragout,
                        R.anim.fragin,
                        R.anim.fragout_detail)
                .replace(R.id.fragment_container,fragment2)
                .addToBackStack(null)
                .commit();

        Log.i("TEST>>>>>",message);
    }

    private void flipCard(){
        /*if(mShowingBack){
            getFragmentManager().popBackStack();
            return;
        }

        mShowingBack = true;*/

        // getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.card_flip_right_in,R.animator.card_flip_right_out, R.animator.card_flip_left_in, R.animator.card_flip_left_out).replace(R.id.fragment_container,fragment2).addToBackStack(null).commit();
    }

}
