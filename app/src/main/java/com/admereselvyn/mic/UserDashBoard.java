package com.admereselvyn.mic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class UserDashBoard extends AppCompatActivity {
    
    private TabLayout tabLayout;
    private TabItem mySubmission, contest, profile;
    private ViewPager viewPager;
    private PageAdapter pageAdapter;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_board);

        tabLayout = findViewById(R.id.tabLayout);
        mySubmission = findViewById(R.id.mySubmission);
        contest = findViewById(R.id.contest);
        profile = findViewById(R.id.profile);
        viewPager = findViewById(R.id.vPager);
        bottomNavigation = findViewById(R.id.bottomNavView);

        bottomNavigation.setBackground(null);
        bottomNavigation.getMenu().getItem(2).setEnabled(false);
        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2)
                    pageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}