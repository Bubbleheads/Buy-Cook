package bubbleheads.buy_cook;

/**
 * Created by MARVIN on 07.04.2017.
 */

import java.util.ArrayList;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class FavoriteRecipesAdapter extends ArrayAdapter<Recipe> {
    public FavoriteRecipesAdapter(Context context, ArrayList<Recipe> favRecipes) {
        super(context, 0, favRecipes);
    }

    @Override
    public final View getView(int position, View convertView, ViewGroup parent) {
        Recipe favRecipe = this.getItem(position);
        RelativeLayout rlRecipe;
        ImageView svImageRecipe;
        TextView tvRecipeName;

        if(convertView == null){
            //LayoutInflater inflater = LayoutInflater.from(getContext());
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rlRecipe = (RelativeLayout) inflater.inflate(R.layout.item_recipe, parent, false);

        } else {
            rlRecipe = (RelativeLayout) convertView;
        }

        svImageRecipe = (ImageView) rlRecipe.findViewById(R.id.ivRecipe);
        tvRecipeName = (TextView) rlRecipe.findViewById(R.id.tvName);
        //svImageRecipe.setImageUrl(favRecipe.getRecipeUrl());
        //Log.d("debug", "URL  : " + favRecipe.getRecipeUrl());
        tvRecipeName.setText(favRecipe.getRecipeName());

        return rlRecipe;

    }
}
