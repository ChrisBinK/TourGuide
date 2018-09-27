package com.example.android.touringguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        addTabs(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new RestaurantFragment(), "RESTAURANTS");
        adapter.addFrag(new ArtFragment(), "ARTS AND MUSEUMS");
        adapter.addFrag(new ArchitectureFragment(), "ARCHITECTURE");
        adapter.addFrag(new ParkFragment(), "PARKS");
        viewPager.setAdapter(adapter);
    }

}
