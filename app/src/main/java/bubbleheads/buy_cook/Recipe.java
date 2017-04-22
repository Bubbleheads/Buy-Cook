package bubbleheads.buy_cook;

public class Recipe {
    private final String recipeName;
    private final String recipeDetail;
    private final int recipePhoto;
    private final int categoryID;
    private final String recipeHowToCook;
    private final String timeOfCooking;
    private final String difficultyOfCooking;
    private boolean favorite;

    public Recipe(final String name, final String detail, final int photo, final int categoryID,
                  final String recipeHowToCook, final String timeOfCooking, final String difficultyOfCooking) {
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipeHowToCook = recipeHowToCook;
        this.recipePhoto = photo;
        this.difficultyOfCooking = difficultyOfCooking;
        this.timeOfCooking = timeOfCooking;
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

    public String getTimeOfCooking() {
        return timeOfCooking;
    }

    public String getDifficultyOfCooking() {
        return difficultyOfCooking;
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