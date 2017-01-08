package com.samparents.activity;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samparents.R;
import com.samparents.pagerAdapter.TestPagerAdapter;
import com.samparents.utils.SlidingTabLayout;

import rmn.androidscreenlibrary.ASSL;

public class TestActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlidingTabLayout viewPagerTabs;
    private TestPagerAdapter testPagerAdapter;
    private TextView textViewActionTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        new ASSL(this, (ViewGroup) findViewById(R.id.root), 1134, 720,
                false);

        init();
    }

    private void init() {

        textViewActionTitle = (TextView) findViewById(R.id.textViewActionTitle);
        textViewActionTitle.setText("TEST");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerTabs = (SlidingTabLayout) findViewById(R.id.viewPagerTabs);

        testPagerAdapter = new TestPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(testPagerAdapter);

        viewPagerTabs.setDistributeEvenly(true);
        viewPagerTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return Color.parseColor("#ffffff");
            }
        });

        viewPagerTabs.setViewPager(viewPager);

    }
}
