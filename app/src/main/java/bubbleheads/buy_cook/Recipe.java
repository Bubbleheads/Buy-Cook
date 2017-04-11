package bubbleheads.buy_cook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final Category category;
    private final String recipeHowToCook;
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final Category category,final String recipeHowToCook) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipePhoto = photo;
        this.category = category;
        this.recipeHowToCook = recipeHowToCook;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeDetail() {
        return recipeDetail;
    }

    public int getRecipePhoto() {
        return recipePhoto;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public Category getCategory() {
        return category;
    }

    public void changeFavorite() {
        this.favorite = !this.favorite;
    }
}