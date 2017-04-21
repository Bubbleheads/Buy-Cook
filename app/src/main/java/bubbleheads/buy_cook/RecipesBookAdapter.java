package bubbleheads.buy_cook;

import android.content.Context;
import android.text.TextUtils;
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

public final class RecipesBookAdapter extends BaseAdapter implements Filterable {
    private final Context context;
    private final ArrayList<Recipe> backupRecipes;

    private ArrayList<Recipe> recipes;
    private RecipesBookAdapter.ValueFilter valueFilter;

    public RecipesBookAdapter(final Context context, final ArrayList<Recipe> recipes) {
        this.context = context;
        this.recipes = recipes;
        this.backupRecipes = recipes;
    }

    @Override
    public long getItemId(final int position) {
        return position;
    }

    @Override
    public Object getItem(final int position) {
        return recipes.get(position);
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    public View getView(final int position, final View convertView, final ViewGroup parent) {
        final View view = convertView == null ? LayoutInflater.from(context).inflate(R.layout.grid_view_cell, null) : convertView;
        final ImageView recipePhoto = (ImageView) view.findViewById(R.id.grid_image);
        final TextView recipeName = (TextView) view.findViewById(R.id.grid_name);
        final TextView difficultyOfCooking = (TextView) view.findViewById(R.id.grid_difficulty_of_cooking);
        final TextView timeOfCooking = (TextView) view.findViewById(R.id.grid_time_of_cooking);
        recipeName.setText(recipes.get(position).getRecipeName());
        timeOfCooking.setText(recipes.get(position).getTimeOfCooking());
        difficultyOfCooking.setText(recipes.get(position).getDifficultyOfCooking());
        recipePhoto.setImageResource(recipes.get(position).getRecipePhoto());
        return view;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
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
        protected FilterResults performFiltering(final CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (!constraint.toString().isEmpty()) {
                final List<Recipe> search = searchRecipeName(constraint, recipes);
                results.count = search.size();
                results.values = search;
            } else {
                results.count = backupRecipes.size();
                results.values = backupRecipes;
            }
            return results;
        }

        private List<Recipe> searchRecipeName(final CharSequence name, final ArrayList<Recipe> recipes) {
            final List<Recipe> filterList = new ArrayList<>();
            for (final Recipe recipe : recipes) {
                if (checkNames(name.toString(), recipe.getRecipeName())) {
                    filterList.add(recipe);
                }
            }
            return filterList;
        }

        private boolean checkNames(final String toFindName, final String recipeName) {
            return recipeName.toUpperCase().contains(toFindName.toUpperCase());
        }

        @Override
        protected void publishResults(final CharSequence constraint, final FilterResults results) {
            recipes = (ArrayList) results.values;
            notifyDataSetChanged();
        }
    }
}