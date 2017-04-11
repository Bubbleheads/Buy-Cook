package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecipesBookFragment extends Fragment {
    private ArrayList<Recipe> recipes;
    private RecipesBookAdapter recipesBookAdapter;
    private int chosenCategoryID;

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.grid_view_fragment, container, false);
        recipes = filterRecipes(chosenCategoryID);
        setUpCollection(view);
        setUpSearching(view);
        return view;
    }

    private ArrayList<Recipe> filterRecipes(int categoryID) {
        final ArrayList<Recipe> result = new ArrayList<>();
        final RecipeList recipeList = new RecipeList();
        for (final Recipe recipe : recipeList.getRecipeInstance().getRecipes()) {
            if (recipe.getCategoryID() == categoryID) {
                result.add(recipe);
            }
        }
        return result;
    }

    public void setChosenCategoryID(final int category) {
        this.chosenCategoryID = category;
    }

    private void setUpCollection(final View view) {
        final GridView collectionView = (GridView) view.findViewById(R.id.collection_view);
        recipesBookAdapter = new RecipesBookAdapter(getContext(), recipes);
        collectionView.setAdapter(recipesBookAdapter);
        collectionView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, final View view,
                                    final int position, final long l) {
                Toast.makeText(view.getContext(),
                        recipesBookAdapter.getRecipes().get(position).getRecipeName(),
                        Toast.LENGTH_SHORT).show();
                recipesBookAdapter.getRecipes().get(position).changeFavorite();
                recipesBookAdapter.notifyDataSetChanged();
            }
        });
    }

    private void setUpSearching(final View view) {
        final SearchView findRecipe = (SearchView) view.findViewById(R.id.searchRecipe);
        findRecipe.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(final String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(final String newText) {
                recipesBookAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
