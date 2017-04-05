package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private final ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeList(){
        recipes.add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail, Category.DRINKS));
        recipes.add(new Recipe("Cookie", "mint", R.drawable.pyrig, Category.COOKIES));
        recipes.add(new Recipe("Sweets", "berries", R.drawable.kex, Category.COOKIES));
        recipes.add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee, Category.DRINKS));
        recipes.add(new Recipe("Something tasty", "sugar,fat", R.drawable.pampukh,Category.LUNCH));
        recipes.add(new Recipe("Pechenko", "sugar, flour,galaretka", R.drawable.pechenko,Category.COOKIES));
    }

    public ArrayList<Recipe> getRecipes(){
        return recipes;
    }
}
