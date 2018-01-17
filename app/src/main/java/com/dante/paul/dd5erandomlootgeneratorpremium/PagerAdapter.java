package com.dante.paul.dd5erandomlootgeneratorpremium;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dante.paul.dd5erandomlootgeneratorpremium.Fragments.ItemsFragment;
import com.dante.paul.dd5erandomlootgeneratorpremium.Fragments.SpellsFragment;
import com.dante.paul.dd5erandomlootgeneratorpremium.Fragments.TreasureFragment;

/**
 * Created by PaulD on 2015-12-10.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TreasureFragment tab1 = new TreasureFragment();
                return tab1;
            case 1:
                ItemsFragment tab2 = new ItemsFragment();
                return tab2;
            case 2:
                SpellsFragment tab3 = new SpellsFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
