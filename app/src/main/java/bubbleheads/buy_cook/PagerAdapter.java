package bubbleheads.buy_cook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private static final int COLLECTION_SCREEN = 0;
    private static final int FAVOURITE_RECIPES = 1;
    private static final int PRODUCTS_TO_BUY = 2;
    private final int numOfTabs;
    private final CategoriesFragment categoriesFragment;
    private final FavoriteRecipesFragment favoriteRecipesFragment;

    public PagerAdapter(final FragmentManager fragmentManager, final int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
        categoriesFragment = new CategoriesFragment();
        favoriteRecipesFragment = new FavoriteRecipesFragment();
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case COLLECTION_SCREEN:
                return categoriesFragment;
            case FAVOURITE_RECIPES:
                return favoriteRecipesFragment;
            case PRODUCTS_TO_BUY:
                System.out.println(Basket.getInstance().show());
                return new IngredientListFragment();
            default:
                throw new RuntimeException("No tab is selected.");
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}