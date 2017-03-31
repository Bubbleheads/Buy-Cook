package bubbleheads.buy_cook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;


    public PagerAdapter(FragmentManager fragmentManager, int NumOfTabs) {
        super(fragmentManager);
        this.mNumOfTabs = NumOfTabs;
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
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

