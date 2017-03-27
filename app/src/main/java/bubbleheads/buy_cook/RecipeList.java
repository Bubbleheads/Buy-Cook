package bubbleheads.buy_cook;

import java.util.ArrayList;


/**
 * Created by melod on 22.03.2017.
 */

public class RecipeList {

    private ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeList(){
        recipes.add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail));
        recipes.add(new Recipe("Cookie", "mint", R.drawable.pyrig));
        recipes.add(new Recipe("Sweets", "berries", R.drawable.kex));
        recipes.add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee));
        recipes.add(new Recipe("Something tasty", "sugar,fat", R.drawable.pampukh));
        recipes.add(new Recipe("Pechenko", "sugar, flour,galaretka", R.drawable.pechenko));
    }

    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }

}
