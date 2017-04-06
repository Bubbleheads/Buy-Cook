package bubbleheads.buy_cook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final Category category;
    private final int categoryID;
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final int categoryID) {
        final CategoryList categoryList = new CategoryList();
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipePhoto = photo;
        this.categoryID = categoryID;
        this.category = categoryList.getCategory(categoryID);
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

    public int getCategoryID() {
        return categoryID;
    }

    public void changeFavorite() {
        this.favorite = !this.favorite;
    }
}