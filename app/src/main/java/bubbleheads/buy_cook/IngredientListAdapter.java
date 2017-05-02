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

import bubbleheads.buy_cook.IngredientListAdapter.MyViewHolder;

public class IngredientListAdapter extends Adapter<MyViewHolder> {

    private final IngredientListFragment ingredientListFragment;
    private final ArrayList<Ingredient> ingredientsToBuy = new ArrayList<>();

    protected static class MyViewHolder extends ViewHolder {

        private MyViewHolder(final View view) {
            super(view);
        }
    }

    public IngredientListAdapter(final IngredientListFragment ingredientListFragment) {
        this.ingredientListFragment = ingredientListFragment;
        fillIngredientsToBuy();
    }

    private void fillIngredientsToBuy(){
        for (Ingredient ingredient: Basket.getInstance().getProductsToBuy().keySet()){
            ingredientsToBuy.add(ingredient);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ingredient_list_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Ingredient ingredient = ingredientsToBuy.get(position);
        final TextView ingredientName = (TextView) holder.itemView.findViewById(R.id.ingredient_name);
        final TextView ingredientQuantity = (TextView) holder.itemView.findViewById(R.id.ingredient_quantity);
        final TextView ingredientMeasurement = (TextView) holder.itemView.findViewById(R.id.ingredient_measurement);
        ingredientName.setText(ingredient.getName());
        ingredientQuantity.setText(String.valueOf(Basket.getInstance().getProductsToBuy().get(ingredient)));
        ingredientMeasurement.setText(ingredient.getMeasurement().getName());
    }

    @Override
    public int getItemCount() {
        return Basket.getInstance().getProductsToBuy().size();
    }
}
