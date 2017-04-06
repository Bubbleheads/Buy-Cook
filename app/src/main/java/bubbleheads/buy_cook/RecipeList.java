package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private final ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeList() {
        final CategoryList categoryList = new CategoryList();
        recipes.add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail, 7));
        recipes.add(new Recipe("Cookie", "mint", R.drawable.pyrig, 9));
        recipes.add(new Recipe("Sweets", "berries", R.drawable.kex, 9));
        recipes.add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee, 7));
        recipes.add(new Recipe("Something tasty", "sugar,fat", R.drawable.pampukh, 5));
        recipes.add(new Recipe("Pechenko", "sugar, flour,galaretka", R.drawable.pechenko, 9));
    }

    public final ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
