package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private static final ArrayList<Recipe> recipes = new ArrayList<Recipe> (){
        {
            add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail, 7));
            add(new Recipe("Cookie", "mint", R.drawable.pyrig, 9));
            add(new Recipe("Sweets", "berries", R.drawable.kex, 9));
            add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee, 7));
            add(new Recipe("Something tasty", "sugar,fat", R.drawable.pampukh, 5));
            add(new Recipe("Pechenko", "sugar, flour,galaretka", R.drawable.pechenko, 9));
        }
    };

    public final ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
