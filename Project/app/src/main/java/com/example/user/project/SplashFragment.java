package com.example.user.project;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * splash fragment
 */
public class SplashFragment extends Fragment {
    private final int time = 3000;
    private FragmentManager fragmentManager;

    /**
     * empty constructor
     */

    public SplashFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        fragmentManager = getFragmentManager();
        return view;
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fragmentManager.beginTransaction().replace(R.id.frag_container, new RecyclerFragment()).commit();


            }
        });
        t1.start();
    }
}
