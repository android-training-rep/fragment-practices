package com.example.fragmentpractices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fgmr;
    AndroidFragment androidFragment = new AndroidFragment();
    JavaFragment javaFragment = new JavaFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fgmr = getSupportFragmentManager();

        FragmentTransaction transaction= fgmr.beginTransaction();
        transaction.add(R.id.container, androidFragment);
        transaction.commit();
    }

    public void setAndroidFragment(View view) {
        FragmentTransaction transaction = fgmr.beginTransaction();
        transaction.replace(R.id.container, androidFragment);
        transaction.commit();
    }


    public void setJavaFragment(View view) {
        FragmentTransaction transaction = fgmr.beginTransaction();
        transaction.replace(R.id.container, javaFragment);
        transaction.commit();
    }
}