package bubbleheads.buy_cook;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
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
    private Category chosenCategory;

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.grid_view_fragment, container, false);
        recipes = filterRecipes(chosenCategory);
        setUpCollection(view);
        setUpSearching(view);
        return view;
    }
    private ArrayList<Recipe> filterRecipes(Category category) {
        final ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : ((MainActivity) getActivity()).getRecipesList()) {
            if (recipe.getFavorite()) {
                result.add(recipe);
            }
        }
        return result;
    }
    public void setChosenCategory(final Category chosenCategory) {
        this.chosenCategory = chosenCategory;
    }
    private void setUpCollection(final View view) {
        favoriteView = (GridView) view.findViewById(R.id.collection_view);
        recipesBookAdapter = new RecipesBookAdapter(getContext(), recipes);
        favoriteView.setAdapter(recipesBookAdapter);
        favoriteView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, final View view,
                                    final int position, final long l) {
                Toast.makeText(view.getContext(),
                        recipesBookAdapter.getRecipes().get(position).getRecipeName(),
                        Toast.LENGTH_SHORT).show();
                recipesBookAdapter.getRecipes().get(position).toggleFavorite();
                recipesBookAdapter.notifyDataSetChanged();
                ((MainActivity) getActivity()).setDetailedRecipe(recipesBookAdapter.getRecipes().get(position));
                ((MainActivity) getActivity()).showFragment(new RecipeDetailedFragment());
            }
        });
    }
    private void setUpSearching(final View view) {
        findRecipe = (SearchView) view.findViewById(R.id.searchRecipe);
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

