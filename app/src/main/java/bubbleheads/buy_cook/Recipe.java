package bubbleheads.buy_cook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final String recipeHowToCook;
    private final Category category;
    private boolean favorite;
    private final Map ingredientMap;

    public Recipe(final String name, final String detail,
                  final int photo, final Category category, final String recipeHowToCook, final Map ingredientMap) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipeHowToCook = recipeHowToCook;
        this.recipePhoto = photo;
        this.category = category;
        this.ingredientMap = ingredientMap;
    }

    public String getRecipeName() {return recipeName;}

    public String getRecipeDetail() {return recipeDetail;}

    public int getRecipePhoto() {return recipePhoto;}

    public String getRecipeHowToCook() {return recipeHowToCook;}

    public boolean getFavorite() {return favorite;}

    public Map getIngredientMap() {return ingredientMap;}

    public Category getCategory() {return category;}

    public void toggleFavorite() {this.favorite = !this.favorite;}

    public boolean isFavorite() {return favorite;}
}



