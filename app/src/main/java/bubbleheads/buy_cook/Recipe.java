package bubbleheads.buy_cook;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final String recipeHowToCook;
    private final Category category;
<<<<<<< HEAD
    private final String recipeHowToCook;
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final Category category,final String recipeHowToCook) {
=======
    private boolean favorite;

    public Recipe(final String name, final String detail,
                  final int photo, final Category category, final String recipeHowToCook) {
>>>>>>> 1f69cb79b561d4c072fde2fef0c76682d3fbff2a
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipeHowToCook = recipeHowToCook;
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

    public String getRecipeHowToCook() {
        return recipeHowToCook;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public Category getCategory() {
        return category;
    }

    public void toggleFavorite() {
        this.favorite = !this.favorite;
    }
}