package ui;

import com.littlered.conclusion.Fragment1;
import com.littlered.conclusion.Fragment2;
import com.littlered.conclusion.Fragment3;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int numOfItems;
    public PagerAdapter(FragmentManager fm, int numOfItems) {
        super(fm);
        this.numOfItems = numOfItems;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment1 fg1 = new Fragment1();
                return fg1;
            case 1:
                Fragment2 fg2 = new Fragment2();
                return fg2;
            case 2:
                Fragment3 fg3 = new Fragment3();
                return fg3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numOfItems;
    }
}
