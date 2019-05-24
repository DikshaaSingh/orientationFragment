package com.example.orientationfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment1 extends Fragment {
    EditText et;
    TextView t;
    Button btn;
   // Fragmentdata fragmentdata;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        et = v.findViewById(R.id.pass);
        t = v.findViewById(R.id.etm);
        btn = v.findViewById(R.id.btnsend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextString = et.getText().toString();
                t.setText(editTextString);


            }
        });
        setRetainInstance(true);
        if (savedInstanceState != null) {
            String s = savedInstanceState.getString("savedTextViewState");
            t.setText(s);

        }

        return v;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String editTextString = et.getText().toString();
        outState.putString("savedTextViewState", editTextString);

    }
}

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        fragmentdata= (Fragmentdata) context;
//
//    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fragmentdata.Send(et.getText().toString());
//
//            }
//        });
//
//
//    }
//    public void receive(String data){
//        et.setText(data);
//    }
//
//
//    public interface Fragmentdata{
//        void Send(String data);
//    }
//}

