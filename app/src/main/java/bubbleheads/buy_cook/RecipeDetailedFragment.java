package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RecipeDetailedFragment extends Fragment {

    private Recipe recipeDescription;
    private int portions;

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.detailed_recipe_fragment, container, false);
        recipeDescription = ((MainActivity) getActivity()).getDetailedRecipe();
        getActivity().setTitle(recipeDescription.getRecipeName());

        setHasOptionsMenu(true);


        portions = Basket.getInstance().getPortionQuantity(recipeDescription);
        final ImageView detailedRecipeImage = (ImageView) view.findViewById(R.id.detailed_recipe_image);
        detailedRecipeImage.setImageResource(recipeDescription.getRecipePhoto());
        final RecyclerView recipeDetail = (RecyclerView) view.findViewById(R.id.detailed_recipe_detail);
        final RecipeDetailedProductsAdapter recipeDetailAdapter
                = new RecipeDetailedProductsAdapter(this, recipeDescription);
        recipeDetail.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        recipeDetail.setAdapter(recipeDetailAdapter);
        recipeDetailAdapter.notifyDataSetChanged();
        final TextView detailedRecipes = (TextView) view.findViewById(R.id.how_to_cook);
        detailedRecipes.setText(recipeDescription.getRecipeHowToCook());
        setHasOptionsMenu(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        final TextView portionQuantity = (TextView) view.findViewById(R.id.portion_quantity);
        portionQuantity.setText(String.valueOf(portions));
        final Button addPortion = (Button) view.findViewById(R.id.plus_button);
        addPortion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                portions++;
                portionQuantity.setText(String.valueOf(portions));
            }
        });
        final Button subtractPortion = (Button) view.findViewById(R.id.minus_button);
        subtractPortion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                portions--;
                portionQuantity.setText(String.valueOf(portions));

            }
        });
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.recipe_fragment, menu);
        menu.findItem(R.id.favorite_button)
                .setIcon(recipeDescription.getFavorite()? R.drawable.ic_favorite_checked: R.drawable.ic_favorite_unchecked);
    }

    @Override
    public void onStop() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Basket.getInstance().processProducts(recipeDescription
                , recipeDescription.getIngredientMap()
                , portions);
        super.onStop();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                getActivity().onBackPressed();
                return true;
            case R.id.favorite_button:
                RecipeList.getInstance().toggleFavoriteInList(recipeDescription);
                item.setIcon(recipeDescription.getFavorite()? R.drawable.ic_favorite_checked: R.drawable.ic_favorite_unchecked);
        }
        return super.onOptionsItemSelected(item);
    }
}