package com.example.fragmentruntimeexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {
    private Button button;
    private EditText e5,e6,e7,e8;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        e5 = view.findViewById(R.id.editText_patientemail);
        e6 = view.findViewById(R.id.editText_patientaddress);
        e7 = view.findViewById(R.id.editText_patientemail);
        e8 = view.findViewById(R.id.editText_contactno);





        button = view.findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String patientname = e5.getText().toString();
                String patientaddress = e6.getText().toString();
                String patientemail = e7.getText().toString();
                String patientphoneno = e8.getText().toString();
                Allfragments allfragments = getArguments().getParcelable(Constants.KEY_ALL_FRAG_DATA);
                allfragments.setPatientname(patientname);
                allfragments.setPatientaddress(patientaddress);
                allfragments.setPatientemail(patientemail);
                allfragments.setPatientcontno(patientphoneno);

                Bundle b =new Bundle();
                b.putParcelable("Allfragments",allfragments);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(b);

                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,secondFragment,null).addToBackStack(null).commit();
            }
        });
        return view;
    }

}