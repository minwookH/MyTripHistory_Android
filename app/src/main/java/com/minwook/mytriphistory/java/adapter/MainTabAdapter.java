package com.minwook.mytriphistory.java.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.minwook.mytriphistory.java.ui.fragment.ContentsFragment;
import com.minwook.mytriphistory.java.ui.fragment.MapFragment;

public class MainTabAdapter extends FragmentPagerAdapter {

    private String[] tabTitle = {"리스트", "지도"};

    public MainTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = ContentsFragment.newInstance();
                break;
            case 1:
                fragment = MapFragment.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitle[position];
    }
}
