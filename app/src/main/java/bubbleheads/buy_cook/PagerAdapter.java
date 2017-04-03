package bubbleheads.buy_cook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;


    public PagerAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        final int COLLECTION_SCREEN = 0;
        final int FAVOURITE_RECIPES = 1;
        final int CHOSEN_RECIPES = 2;

        switch (position) {
            case COLLECTION_SCREEN:
                return new CategoriesFragment();
            case FAVOURITE_RECIPES:
                return new Fragment();
            case CHOSEN_RECIPES:
                return new Fragment();
            default:
                throw new RuntimeException("No tab is selected.");
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}

