package com.example.orientationfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment2 extends Fragment {
TextView ett;
EditText editText;
Button btn;
    //Fragmentdata fragmentdata;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_fragment2, container, false);
        ett=v.findViewById(R.id.et2);
        editText=v.findViewById(R.id.pass1);
        btn=v.findViewById(R.id.btnsend1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextString=editText.getText().toString();
                ett.setText(editTextString);


            }
        });
        setRetainInstance(true);
        if(savedInstanceState!=null){
            String s=savedInstanceState.getString("savedTextViewState");
            ett.setText(s);

        }





        return v;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String editTextString=ett.getText().toString();
        outState.putString("savedTextViewState",editTextString);

    }
//    public  void  send(String data){
//        ett.setText(data);
//    }

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
//                fragmentdata.Receive(editText.getText().toString());
//
//            }
//        });




//    public interface Fragmentdata{
//        void Receive(String data);
//
//
//
//    }


}
