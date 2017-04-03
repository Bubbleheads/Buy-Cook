package bubbleheads.buy_cook;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends Adapter<CategoriesAdapter.MyViewHolder> {
    private final CategoriesFragment categoriesFragment;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public View itemView;

        private MyViewHolder(final View view) {
            super(view);
            itemView = view;
            text = (TextView) view.findViewById(R.id.text);
        }
    }

    public CategoriesAdapter(final CategoriesFragment categoriesFragment) {
        this.categoriesFragment = categoriesFragment;
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
       final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categories_cell, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.text.setText((Category.values())[position].getName());
    }

    @Override
    public int getItemCount() {
        return Category.values().length;
    }
}