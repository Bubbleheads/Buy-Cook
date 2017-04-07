package bubbleheads.buy_cook;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import bubbleheads.buy_cook.CategoriesAdapter.MyViewHolder;

public class CategoriesAdapter extends Adapter<MyViewHolder> {
    private final CategoriesFragment categoriesFragment;

    protected static class MyViewHolder extends ViewHolder {

        private final TextView text;
        private final View view;
        private final RecyclerView rv;

        private MyViewHolder(final View view) {
            super(view);
            this.view = view;
            text = (TextView) view.findViewById(R.id.categories_name);
            rv = (RecyclerView) view.findViewById(R.id.recycler_view);
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
        final TextView categoryName = (TextView) holder.itemView.findViewById(R.id.categories_name);
        categoryName.setText(Category.values()[position].getName());
        categoryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), Category.values()[position].getName(), Toast.LENGTH_SHORT).show();
                final RecipesBookFragment fragment = new RecipesBookFragment();
                fragment.setChosenCategory(Category.values()[position]);
                ((MainActivity) categoriesFragment.getActivity()).showFragment(fragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Category.values().length;
    }
}