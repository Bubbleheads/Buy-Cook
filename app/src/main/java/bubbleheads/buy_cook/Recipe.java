package bubbleheads.buy_cook;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final int categoryID;
    private final String recipeHowToCook;
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final int categoryID, final String recipeHowToCook) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipeHowToCook = recipeHowToCook;
        this.recipePhoto = photo;
        this.categoryID = categoryID;
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

    public String getRecipeHowToCook() {
        return recipeHowToCook;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void toggleFavorite() {
        this.favorite = !this.favorite;
    }
}