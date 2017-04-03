package bubbleheads.buy_cook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private boolean favorite;
    private final Category category;

    public Recipe(final String name,final String detail,final int photo,final Category category) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipePhoto = photo;
        this.category = category;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public String getRecipeDetail() {
        return this.recipeDetail;
    }

    public int getRecipePhoto() {
        return this.recipePhoto;
    }

    public boolean getFavorite() {
        return this.favorite;
    }

    public Category getCategory() {
        return this.category;
    }

    public void changeFavorite() {
      this.favorite =!this.favorite;
    }
}