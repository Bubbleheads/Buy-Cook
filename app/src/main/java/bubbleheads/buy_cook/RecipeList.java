package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private final ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeList() {
        recipes.add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail, Category.DRINKS));
        recipes.add(new Recipe("Cookie", "mint, flour,sugar", R.drawable.pyrig, Category.COOKIES));
        recipes.add(new Recipe("Sweets", "berries,sugar,flour,fat", R.drawable.kex, Category.COOKIES));
        recipes.add(new Recipe("Coffee", "coffee, sugar, milk", R.drawable.coffee, Category.DRINKS));
        recipes.add(new Recipe("Dumplings", "sugar,fat,flour,berries", R.drawable.pampukh, Category.LUNCH));
        recipes.add(new Recipe("Cookies with jam", "sugar,flour,jam,butter,jam", R.drawable.pechenko, Category.COOKIES));
    }

    public final ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
