package com.example.socichat.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private  int count;

    public FragmentAdapter(@NonNull FragmentManager fm,int count) {

        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.count=count;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StatusFragment();

            case 1:

                return new ChatFragment();

            case 2:

                return new CallsFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
