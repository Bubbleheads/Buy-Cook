package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
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
        final ImageView detailedRecipeImage = (ImageView) view.findViewById(R.id.detailed_recipe_image);
        detailedRecipeImage.setImageResource(recipeDescription.getRecipePhoto());
        final TextView recipeDetail = (TextView) view.findViewById(R.id.detailed_recipe_detail);
        recipeDetail.setText(recipeDescription.getRecipeDetail());
        final TextView detailedRecipes = (TextView) view.findViewById(R.id.how_to_cook);
        detailedRecipes.setText(recipeDescription.getRecipeHowToCook());
        setHasOptionsMenu(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        final FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RecipeList.getInstance().toggleFavoriteInList(recipeDescription);
                Toast.makeText(getContext(), "Added to favorites", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txtCount = (TextView) view.findViewById(R.id.couterValue);
        final Button buttonClick = (Button) view.findViewById(R.id.plus_button);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String countValue = txtCount.getText().toString();
                portions = Integer.parseInt(countValue);
                portions++;

                txtCount.setText(String.valueOf(portions));
            }
        });
        final Button buttonReset = (Button) view.findViewById(R.id.minus_button);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String countValue = txtCount.getText().toString();
                portions = Integer.parseInt(countValue);
                portions--;

                txtCount.setText(String.valueOf(portions));

            }
        });
        return view;
    }


    @Override
    public void onStop() {
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
}