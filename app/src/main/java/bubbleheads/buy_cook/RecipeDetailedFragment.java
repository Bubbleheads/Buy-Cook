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
import static android.R.attr.button;
import static android.R.id.toggle;

public class RecipeDetailedFragment extends Fragment {

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
        return view;
    }
}
