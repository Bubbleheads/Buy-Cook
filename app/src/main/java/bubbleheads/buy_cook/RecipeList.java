package bubbleheads.buy_cook;

import java.util.ArrayList;

public class RecipeList {

    private final ArrayList<Recipe> recipes = new ArrayList<>();

    private final String CocoaCocatail = "Mix 2 tablespoons of cocoa with a glass of milk.";
    private final String Cookie = "Bake the cookies for 9-11 minutes. Take them out when they look puffy, are set around the edges, and dry to the touch.";
    private final String Kex = "Bake the kex for 5-7 minutes. Take them out when they look puffy, are set around the edges, and dry to the touch.";
    private final String Coffee = "Mix 2 tablespoons of coffee with a glass of milk, sprinkle with chocolate.";
    private final String TastyFood = ": Tear off a large piece of parchment paper roughly 12 inches wide. Use your hands or a rolling pin to flatten the dough until it is 1/4-inch thick or less.";
    private final String Pechenko = "Bake the kex for 5-7 minutes. Take them out when they look puffy, are set around the edges, and dry to the touch.";

    public RecipeList() {
        recipes.add(new Recipe("Cocoa cocktail", "milk,cocoa,water", R.drawable.cocoacocktail, Category.DRINKS));
        recipes.add(new Recipe("Cookie", "mint", R.drawable.pyrig, Category.COOKIES));
        recipes.add(new Recipe("Sweets", "berries", R.drawable.kex, Category.COOKIES));
        recipes.add(new Recipe("Coffee", "chocolade, coffee, sugar", R.drawable.coffee, Category.DRINKS));
        recipes.add(new Recipe("Something tasty", "sugar,fat", R.drawable.pampukh, Category.LUNCH));
        recipes.add(new Recipe("Pechenko", "sugar, flour,galaretka", R.drawable.pechenko, Category.COOKIES));
    }

    public final ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
