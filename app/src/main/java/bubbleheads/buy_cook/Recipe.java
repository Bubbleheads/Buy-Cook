package bubbleheads.buy_cook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String recipeName;
    private String recipeDetail;
    private int recipePhoto;
    private boolean favorite = false;

    public Recipe(String name, String detail, int photo){
        this.recipeName = name;
        this.recipeDetail = detail;
        this.recipePhoto = photo;
    }

    public String getRecipeName(){
        return this.recipeName;
    }

    public String getRecipeDetail(){
        return this.recipeDetail;
    }

    public int getRecipePhoto(){
        return this.recipePhoto;
    }

    public boolean getFavorite(){
        return this.favorite;
    }

    public void changeFavorite(){
        if (this.favorite == false) {
            this.favorite = true;
        }
        else{
            this.favorite = false;
        }
    }
}
