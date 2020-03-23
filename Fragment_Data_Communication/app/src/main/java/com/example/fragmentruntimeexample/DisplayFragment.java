package com.example.fragmentruntimeexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayFragment extends Fragment {

    private static final String TAG = "DisplayFragment";
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        t1 = view.findViewById(R.id.te1);
        t2 = view.findViewById(R.id.te2);
        t3 = view.findViewById(R.id.te3);
        t4 = view.findViewById(R.id.te4);
        t5 = view.findViewById(R.id.te5);
        t6 = view.findViewById(R.id.te6);
        t7 = view.findViewById(R.id.te7);
        t8 = view.findViewById(R.id.te8);
        t9 = view.findViewById(R.id.te9);
        t10 = view.findViewById(R.id.te10);
        t11 = view.findViewById(R.id.te11);
        t12 = view.findViewById(R.id.te12);



        if (getArguments().containsKey(Constants.KEY_ALL_FRAG_DATA)){
            Allfragments allfragments = getArguments().getParcelable(Constants.KEY_ALL_FRAG_DATA);
            Log.d(TAG, "onCreateView: "+allfragments.getAddress());
            t1.setText(allfragments.getName());
            t2.setText(allfragments.getAddress());
            t3.setText(allfragments.getEmail());
            t4.setText(allfragments.getPhno());
            t5.setText(allfragments.getPatientname());
            t6.setText(allfragments.getPatientaddress());
            t7.setText(allfragments.getPatientemail());
            t8.setText(allfragments.getPatientcontno());
            t9.setText(allfragments.getCompanyname());
            t10.setText(allfragments.getDesignation());
            t11.setText(allfragments.getCompanyemail());
            t12.setText(allfragments.getSalary());

        }



        return view;
    }

}
