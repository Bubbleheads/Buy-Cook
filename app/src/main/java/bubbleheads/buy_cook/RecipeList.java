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
            add(new Recipe("Cocoa cocktail", "Milk, cocoa, water", R.drawable.cocoacocktail, 7, CocoaCocatail, "10min", "1"));
            add(new Recipe("Cookie", "Mint, flour,sugar", R.drawable.pyrig, 9, Cookie, "2hours", "4"));
            add(new Recipe("Sweets", "Berries,sugar,flour,fat", R.drawable.kex, 9, Kex, "50min", "3"));
            add(new Recipe("Coffee", "Chocolade, coffee, sugar", R.drawable.coffee, 7, Coffee, "10min", "1"));
            add(new Recipe("Dumplings", "Sugar,fat,flour,berries", R.drawable.pampukh, 5, TastyFood, "3hours", "2"));
            add(new Recipe("Cookies with jam", "Sugar,flour,jam,butter,jam", R.drawable.pechenko, 9, Cookies, "1hour", "3"));
        }
    };

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}