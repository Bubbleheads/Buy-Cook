package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.R.attr.button;
import static android.R.id.toggle;

public class RecipeDetailedFragment extends Fragment {
    int counter = 0;


    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.detailed_recipe_fragment, container, false);
        final Recipe recipeDescription = ((MainActivity) getActivity()).getDetailedRecipe();
        getActivity().setTitle(recipeDescription.getRecipeName());
        final ImageView detailedRecipeImage = (ImageView) view.findViewById(R.id.detailed_recipe_image);
        detailedRecipeImage.setImageResource(recipeDescription.getRecipePhoto());
        final TextView recipeDetail = (TextView) view.findViewById(R.id.detailed_recipe_detail);
        recipeDetail.setText(recipeDescription.getRecipeDetail());
        final TextView detailedRecipes = (TextView) view.findViewById(R.id.how_to_cook);
        detailedRecipes.setText(recipeDescription.getRecipeHowToCook());
        final FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                recipeDescription.toggleFavorite();
                Toast.makeText(getContext(), "Added to favorites", Toast.LENGTH_SHORT ).show();
            }
        });
        final TextView txtCount = (TextView) view.findViewById(R.id.couterValue);
        final Button buttonClick = (Button) view.findViewById(R.id.plus_button);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
              String countValue = txtCount.getText().toString();
                int intcountValue = Integer.parseInt(countValue);
                intcountValue++;

                txtCount.setText(String.valueOf(intcountValue));
            }
        });
        final Button buttonReset = (Button) view.findViewById(R.id.minus_button);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                txtCount.setText(String.valueOf(0));
            }
        });
        return view;
    }
}
