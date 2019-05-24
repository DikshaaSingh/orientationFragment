package com.example.orientationfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity /**implements Fragment1.Fragmentdata, Fragment2.Fragmentdata*/ {
    Fragment1 fragment1;
    Fragment2 fragment2;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        fragment1 = (Fragment1) manager.findFragmentByTag("TagFragment1");
        if (fragment1 == null) {
            fragment1 = new Fragment1();
            FragmentTransaction transaction1 = manager.beginTransaction();
            transaction.add(R.id.frag_container, fragment1);
            transaction.commit();

        }


        fragment2 = (Fragment2) manager.findFragmentByTag("TagFragment2");
        if (fragment1 == null) {
            fragment2 = new Fragment2();
            FragmentTransaction transaction1 = manager.beginTransaction();
            transaction.add(R.id.frag_container, fragment2);
            transaction.commit();


        }


    }

//    @Override
//    public void Send(String data) {
//        fragment2.send(data);
//
//    }
//
//    @Override
//    public void Receive(String data) {
//        fragment1.receive(data);
//
//    }
}
