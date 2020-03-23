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


public class SecondFragment extends Fragment {
    private Button button;
    private EditText e9,e10,e11,e12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        e9 = view.findViewById(R.id.editText_companyname);
        e10 = view.findViewById(R.id.editText_designation);
        e11 = view.findViewById(R.id.editText_companyemail);
        e12 = view.findViewById(R.id.editText_companysalary);

        button = view.findViewById(R.id.b3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String companyname = e9.getText().toString();
                String companydesignation = e10.getText().toString();
                String companyemail = e11.getText().toString();
                String companysalary = e12.getText().toString();
                Allfragments allfragments =getArguments().getParcelable(Constants.KEY_ALL_FRAG_DATA);

                allfragments.setCompanyname(companyname);
                allfragments.setDesignation(companydesignation);
                allfragments.setCompanyemail(companyemail);
                allfragments.setSalary(companysalary);


                Bundle b =new Bundle();
                b.putParcelable("Allfragments",allfragments);
                DisplayFragment df = new DisplayFragment();
                df.setArguments(b);

                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,df,null).addToBackStack(null).commit();
            }
        });

        return view;
    }
}