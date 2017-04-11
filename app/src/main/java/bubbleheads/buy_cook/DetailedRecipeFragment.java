package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedRecipeFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.recipe_detailed_fragment, container, false);
        Recipe recipeDescription = ((MainActivity) getActivity()).getDetailedRecipe();
        getActivity().setTitle(recipeDescription.getRecipeName());
        final ImageView detailedRecipeImage = (ImageView) view.findViewById(R.id.detailed_recipe_image);
        detailedRecipeImage.setImageResource(recipeDescription.getRecipePhoto());
        final TextView recipeDetail = (TextView) view.findViewById(R.id.detailed_recipe_detail);
        recipeDetail.setText(recipeDescription.getRecipeDetail());
        final TextView detailedRecipes = (TextView) view.findViewById(R.id.how_to_cook);
        detailedRecipes.setText(recipeDescription.getRecipeHowToCook());
        return view;
    }
}