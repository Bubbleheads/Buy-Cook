package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private static final RecipeList INSTANCE = new RecipeList();

    public static RecipeList getInstance() {return INSTANCE;}

    private RecipeList(){}


    private final String CocoaCocatail = "Mix 2 tablespoons of cocoa with a glass of milk.";
    private final String Cookie = "Bake the cookies for 9-11 minutes." +
            " Take them out when they look puffy, are set around the edges, and dry to the touch.";
    private final String Kex = "Bake the kex for 5-7 minutes. " +
            "Take them out when they look puffy, are set around the edges, and dry to the touch.";
    private final String Coffee = "Mix 2 tablespoons of coffee with a glass of milk, sprinkle with chocolate.";
    private final String TastyFood = ": Tear off a large piece of parchment paper roughly 12 inches wide." +
            " Use your hands or a rolling pin to flatten the dough until it is 1/4-inch thick or less.";
    private final String Cookies = "Bake the kex for 5-7 minutes. " +
            "Take them out when they look puffy, are set around the edges, and dry to the touch.";


    private final ArrayList<Recipe> recipes = new ArrayList<Recipe> (){
        {
            add(new Recipe("Cocoa cocktail", "milk, cocoa, water", R.drawable.cocoacocktail, 7, CocoaCocatail));
            add(new Recipe("Cookie", "mint, flour,sugar", R.drawable.pyrig, 9, Cookie));
            add(new Recipe("Sweets", "berries,sugar,flour,fat", R.drawable.kex, 9, Kex));
            add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee, 7, Coffee));
            add(new Recipe("Dumplings", "sugar,fat,flour,berries", R.drawable.pampukh, 5, TastyFood));
            add(new Recipe("Cookies with jam", "sugar,flour,jam,butter,jam", R.drawable.pechenko, 9, Cookies));
        }
    };

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}