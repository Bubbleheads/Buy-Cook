package bubbleheads.buy_cook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.widget.Toast;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import bubbleheads.buy_cook.RecipeDetailedProductsAdapter.MyViewHolder;

public class RecipeDetailedProductsAdapter extends Adapter<MyViewHolder>{

    private final RecipeDetailedFragment recipeDetailedFragment;
    private final List<Ingredient> recipeIngredients = new ArrayList<>();
    private final Recipe recipeDetailed;

    protected static class MyViewHolder extends ViewHolder {

        private MyViewHolder(final View view) {
            super(view);
        }
    }

    public RecipeDetailedProductsAdapter(final RecipeDetailedFragment recipeDetailedFragment
            , Recipe recipeDetailed) {
        this.recipeDetailedFragment = recipeDetailedFragment;
        this.recipeDetailed = recipeDetailed;
        fillIngredientsToBuy();
    }

    private void fillIngredientsToBuy(){
        for (Ingredient ingredient: recipeDetailed.getIngredientMap().keySet()){
            recipeIngredients.add(ingredient);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detailed_recipe_ingredient_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Ingredient ingredient = recipeIngredients.get(position);
        final TextView ingredientName = (TextView) holder.itemView.findViewById(R.id.ingredient_name);
        final TextView ingredientQuantity = (TextView) holder.itemView.findViewById(R.id.ingredient_quantity);
        final TextView ingredientMeasurement = (TextView) holder.itemView.findViewById(R.id.ingredient_measurement);
        ingredientName.setText(ingredient.getName());
        ingredientQuantity.setText(String.valueOf(recipeDetailed.getIngredientMap().get(ingredient)));
        ingredientMeasurement.setText(ingredient.getMeasurement().getName());
    }

    @Override
    public int getItemCount() {
        return recipeDetailed.getIngredientMap().size();
    }
}
