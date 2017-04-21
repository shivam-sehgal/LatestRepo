package com.example.user.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by user on 4/20/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    private ArrayList<String> titles = new ArrayList<String>();

    /**
     * @param fm to store fragment manager object
     */
    public ViewPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    /**
     * @param position position in fragments arraylist
     * @return fragment
     */

    @Override
    public Fragment getItem(final int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(final int position) {
        super.getPageTitle(position);
        return titles.get(position);
    }

    /**
     * @param frag  to take fragment object
     * @param title to take title of fragment
     */
    public void addInList(final Fragment frag, final String title) {
        fragments.add(frag);
        titles.add(title);
    }
}
