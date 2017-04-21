package com.example.user.project;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PastFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter viewPagerAdapter;

    /**
     * empty fragment constructor
     */
    public PastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_past, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.child_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.child_tab_layout);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.addInList(new CompletedFragment(), "Completed");
        viewPagerAdapter.addInList(new CancelledFragment(), "Canceled");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
