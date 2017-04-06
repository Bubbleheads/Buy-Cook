package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private final RecipeList recipeList = new RecipeList();
    private Recipe detailedRecipe;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment(new TabLayoutFragment());
    }

    public ArrayList<Recipe> getRecipesList() {
        return recipeList.getRecipes();
    }

    public void setDetailedRecipe(final Recipe recipe) {
        detailedRecipe = recipe;
    }

    public Recipe getChosenRecipe() {
        return this.detailedRecipe;
    }

    public void showFragment(final Fragment fragment) {
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}