package bubbleheads.buy_cook;

/**
 * Created by MARVIN on 07.04.2017.
 */

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;


public final class FavoriteRecipeFragment extends Fragment {
    private FavoriteRecipesAdapter adapter;
    //final ArrayList<FavoriteRecipe> favRecipes = new ArrayList<FavoriteRecipe>();

    //private static Recipe recipe = new Recipe();
    final static ArrayList<Recipe> Recipes = new ArrayList<Recipe>();
    List<Recipe> listFavRecipes = new ArrayList<Recipe>();
    private GridView gvFavoriteRecipes;

    @Override
    public final View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.fragment_favorite_recipe_activity, container, false);
        return view;
    }

    @Override
    public final void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        GridView Recipe = (GridView) getActivity().findViewById(R.id.Recipe);
        final Recipe recipe = (Recipe) getActivity().getIntent().getSerializableExtra("recipe");

        Recipe favRecipe = new Recipe(recipe.getRecipeName(),
                recipe.getRecipeDetail(), recipe.getCategory() );
      //  Recipe.add(favRecipe);

        //listFavRecipes = Recipe.getAll();
        for(Recipe listFavItem : listFavRecipes){
            Log.d("DEBUG", "********Fav recipe -> " + listFavItem.getRecipeName());
            Log.d("DEBUG", "********Fav recipe ING -> " + listFavItem.getRecipeDetail());
        }
        adapter = new FavoriteRecipesAdapter(getActivity().getBaseContext(), (ArrayList<Recipe>)listFavRecipes);
        gvFavoriteRecipes.setAdapter(adapter);
        gvFavoriteRecipes.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View parent,
                                    int position, long rowId) {
                Recipe imageResult = listFavRecipes.get(position);

                Recipe r = new Recipe(imageResult.getRecipeName(), imageResult.getRecipeHowToCook(), imageResult.getCategory());
                Intent i = new Intent(getActivity(), RecipeDetailsActivity.class);
               // i.putExtra("result", r);
                startActivity(i);
            }
        });

    }

}