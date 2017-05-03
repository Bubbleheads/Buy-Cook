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

public class FavoriteRecipesFragment extends Fragment {
    private GridView favoriteView;
    private ArrayList<Recipe> recipes;
    private SearchView findRecipe;
    private RecipesBookAdapter recipesBookAdapter;

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.favorite_recipes_fragment, container, false);
        recipes = filterRecipes();
        setUpCollection(view);
        setUpSearching(view);
        return view;
    }

    private ArrayList<Recipe> filterRecipes() {
        final ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : RecipeList.getInstance().getRecipes()) {
            if (recipe.getFavorite()) {
                result.add(recipe);
            }
        }
        return result;
    }

    private void setUpCollection(final View view) {
        favoriteView = (GridView) view.findViewById(R.id.favorite_view);
        recipesBookAdapter = new RecipesBookAdapter(getContext(), recipes);
        favoriteView.setAdapter(recipesBookAdapter);
        favoriteView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, final View view,
                                    final int position, final long l) {
                recipesBookAdapter.notifyDataSetChanged();
                ((MainActivity) getActivity()).setDetailedRecipe(recipesBookAdapter.getRecipes().get(position));
                ((MainActivity) getActivity()).showFragment(new RecipeDetailedFragment());
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
