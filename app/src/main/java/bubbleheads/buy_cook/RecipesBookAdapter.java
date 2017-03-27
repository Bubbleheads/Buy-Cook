package bubbleheads.buy_cook;

import android.content.Context;
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

/**
 * Created by melod on 26.03.2017.
 */

public class RecipesBookAdapter extends BaseAdapter implements Filterable {
    private Context context;
    private ArrayList<Recipe> recipes;
    private ArrayList<Recipe> backupRecipes;
    private RecipesBookAdapter.ValueFilter valueFilter;

    public RecipesBookAdapter(Context context, ArrayList<Recipe> recipes) {
        this.context = context;
        this.recipes = recipes;
        this.backupRecipes = recipes;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return recipes.get(position);
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.grid_view_cell, null);

        ImageView recipePhoto = (ImageView) convertView.findViewById(R.id.grid_image);
        TextView recipeName = (TextView) convertView.findViewById(R.id.grid_name);
        TextView recipeDetail = (TextView) convertView.findViewById(R.id.grid_detail);
        recipeName.setText(recipes.get(position).getRecipeName());
        recipeDetail.setText(recipes.get(position).getRecipeDetail());
        recipePhoto.setImageResource(recipes.get(position).getRecipePhoto());
        return convertView;
    }

    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }

    @Override
    public Filter getFilter() {
        if (valueFilter == null) {
            valueFilter = new RecipesBookAdapter.ValueFilter();
        }
        return valueFilter;
    }

    private class ValueFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();

            if (!constraint.toString().isEmpty()){
                List<Recipe> search = searchRecipeName(constraint, recipes);
                results.count = search.size();
                results.values = search;
            } else {
                results.count = backupRecipes.size();
                results.values = backupRecipes;
            }
            return results;
        }

        private List<Recipe> searchRecipeName(CharSequence name, ArrayList<Recipe> recipes){
            List<Recipe> filterList = new ArrayList<>();
            for (Recipe recipe: recipes) {
                if (checkNames(name.toString(), recipe.getRecipeName())){
                    filterList.add(recipe);
                }
            }
            return filterList;
        }

        private boolean checkNames(String toFindName, String recipeName){
            return recipeName.toUpperCase().contains(toFindName.toUpperCase());
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            recipes = (ArrayList) results.values;
            notifyDataSetChanged();
        }
    }
}