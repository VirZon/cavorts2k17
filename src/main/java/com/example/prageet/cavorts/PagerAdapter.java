package com.example.prageet.cavorts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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
                Tab_news tab1 = new Tab_news();
                return tab1;
            case 1:
                Tab_schedule tab2 = new Tab_schedule();
                return tab2;
            case 2:
                Tab_Events tab3 = new Tab_Events();
                return tab3;
            case 3:
                Tab_my_activity tab4 = new Tab_my_activity();
                return tab4;
            case 4:
                Tab_contacts tab5 = new Tab_contacts();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}