package com.example.user.project;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * starting activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction;
        fragmentTransaction = fragmentManager.beginTransaction().add(R.id.frag_container, new SplashFragment());

        fragmentTransaction.commit();

    }
}
