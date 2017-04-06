package bubbleheads.buy_cook;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final String recipeHowToCook;
    private final Category category;
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final Category category, final String howToCook) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipeHowToCook = howToCook;
        this.recipePhoto = photo;
        this.category = category;
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
        return this.recipeHowToCook;
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