package bubbleheads.buy_cook;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

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
        getActivity().setTitle(CategoryList.getInstance().getCategory(chosenCategoryID).getName());
        setUpCollection(view);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return view;
    }

    @Override
    public void onStop(){
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        super.onStop();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                getActivity().onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Recipe> filterRecipes(int categoryID) {
        final ArrayList<Recipe> result = new ArrayList<>();
        for (final Recipe recipe : RecipeList.getInstance().getRecipes()) {
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
                ((MainActivity) getActivity()).setDetailedRecipe(recipesBookAdapter.getRecipes().get(position));
                ((MainActivity) getActivity()).showFragment(new RecipeDetailedFragment());
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem searchMenuItem = menu.findItem(R.id.search);
        System.out.println(searchMenuItem.isActionViewExpanded());
        SearchView searchView = (SearchView) searchMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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
