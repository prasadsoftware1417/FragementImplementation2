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

public class HomeFragment extends Fragment {
    private Button button;
    private EditText e1,e2,e3,e4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        e1 = view.findViewById(R.id.editText_name);
        e2 = view.findViewById(R.id.editText_address);
        e3 = view.findViewById(R.id.editText_email);
        e4 = view.findViewById(R.id.editText_phno);

        button = view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String address = e2.getText().toString();
                String email = e3.getText().toString();
                String phoneno = e4.getText().toString();
                Allfragments allfragments = new Allfragments();
                allfragments.setName(name);
                allfragments.setAddress(address);
                allfragments.setEmail(email);
                allfragments.setPhno(phoneno);


                Bundle b =new Bundle();
                b.putParcelable(Constants.KEY_ALL_FRAG_DATA,allfragments);
                FirstFragment firstFragment = new FirstFragment();
                firstFragment.setArguments(b);

                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,firstFragment,null).addToBackStack(null).commit();
            }
        });
        return view;
    }

}