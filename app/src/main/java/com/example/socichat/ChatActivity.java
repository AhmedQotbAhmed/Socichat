package com.example.socichat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.socichat.Fragment.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        final TabLayout tabLayout= findViewById(R.id.tablayout_chat);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_status).setText(R.string.status));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_chat_selec).setText(R.string.chat));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_calls).setText(R.string.calls));

        final int[] select=  new int[]{R.drawable.ic_status_selec,R.drawable.ic_chat_selec,R.drawable.ic_calls_selec};
        final int[] un_select=  new int[]{R.drawable.ic_status,R.drawable.ic_chat,R.drawable.ic_calls};
        final FragmentAdapter adapter= new FragmentAdapter(getSupportFragmentManager(),3);

        final ViewPager viewPager = findViewById(R.id.viewPager_chat);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tab.setIcon(select[tab.getPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setIcon(un_select[tab.getPosition()]);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.setCurrentItem(1);




    }
}