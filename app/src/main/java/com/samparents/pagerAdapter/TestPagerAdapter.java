package com.samparents.pagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.samparents.fragment.TestFragments;

/**
 * Created by rakesh on 8/1/17.
 */

public class TestPagerAdapter extends FragmentStatePagerAdapter {

    public static int pageCount = 2;

    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TestFragments.getInstance();
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return "UPCOMING";
        }else {
            return "COMPLETED";
        }
    }
}
