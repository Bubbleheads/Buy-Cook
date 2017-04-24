package bubbleheads.buy_cook;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bubbleheads.buy_cook.CategoriesAdapter.MyViewHolder;

public class CategoriesAdapter extends Adapter<MyViewHolder> {
    private final CategoriesFragment categoriesFragment;

    protected static class MyViewHolder extends ViewHolder {

        private MyViewHolder(final View view) {
            super(view);
        }
    }

    public CategoriesAdapter(final CategoriesFragment categoriesFragment) {
        this.categoriesFragment = categoriesFragment;
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categories_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Category category = CategoryList.getInstance().getCategoryList().get(position);
        final TextView categoryName = (TextView) holder.itemView.findViewById(R.id.categories_name);
        categoryName.setText(category.getName());
        categoryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RecipesBookFragment fragment = new RecipesBookFragment();
                fragment.setChosenCategoryID(category.getCategoryID());
                ((MainActivity) categoriesFragment.getActivity()).showFragment(fragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return CategoryList.getInstance().getCategoryList().size();
    }
}