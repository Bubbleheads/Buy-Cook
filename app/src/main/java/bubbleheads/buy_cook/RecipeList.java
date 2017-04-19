package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private final ArrayList<Recipe> recipes = new ArrayList<>();

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
    private final String Salad = "Cut your tomato";

    public RecipeList() {
        recipes.add(new Recipe("Cocoa cocktail", "Milk, cocoa, water", R.drawable.cocoacocktail, Category.DRINKS, CocoaCocatail));
        recipes.add(new Recipe("Cookie", "Mint, flour,sugar", R.drawable.pyrig, Category.COOKIES, Cookie));
        recipes.add(new Recipe("Sweets", "Berries,sugar,flour,fat", R.drawable.kex, Category.COOKIES, Kex));
        recipes.add(new Recipe("Coffee", "Chocolade, coffee, sugar", R.drawable.coffee, Category.DRINKS, Coffee));
        recipes.add(new Recipe("Dumplings", "Sugar,fat,flour,berries", R.drawable.pampukh, Category.LUNCH, TastyFood));
        recipes.add(new Recipe("Cookies with jam", "Sugar,flour,jam,butter,jam", R.drawable.pechenko, Category.COOKIES, Cookies));
        recipes.add(new Recipe("Salad", "Salad,tomato", R.drawable.salad, Category.SALADS, Salad));
    }

    public final ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}