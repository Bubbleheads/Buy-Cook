package bubbleheads.buy_cook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private static final int COLLECTION_SCREEN = 0;
    private static final int FAVOURITE_RECIPES = 1;
    private static final int CHOSEN_RECIPES = 2;
    private final int numOfTabs;
    private final CategoriesFragment categoriesFragment;
    private final FavoriteRecipesFragment favoriteRecipesFragmentRecipesFragment;


    public PagerAdapter(final FragmentManager fragmentManager, final int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
        categoriesFragment = new CategoriesFragment();
        favoriteRecipesFragmentRecipesFragment = new FavoriteRecipesFragment();
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case COLLECTION_SCREEN:
                return categoriesFragment;
            case FAVOURITE_RECIPES:
                return favoriteRecipesFragmentRecipesFragment;
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