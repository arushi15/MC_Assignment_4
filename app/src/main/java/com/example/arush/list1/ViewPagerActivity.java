package com.example.arush.list1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        int position = getIntent().getIntExtra("position",0);
        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return null; /*new FragmentClassName(position)*/
            }

            @Override
            public int getCount() {
                return 0;   // TODO: 09-11-2016 return size of list of tasks, from db
            }
        });
        vp.setCurrentItem(position);
    }
}
