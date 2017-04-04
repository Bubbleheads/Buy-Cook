package bubbleheads.buy_cook;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView.Adapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.google.android.gms.internal.zzs.TAG;

public class CategoriesAdapter extends Adapter<CategoriesAdapter.MyViewHolder> {
    private final CategoriesFragment categoriesFragment;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public final TextView text;
        public final View itemView;

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
    public void onBindViewHolder(MyViewHolder holder, final int position) {
       final TextView categoryName = (TextView) holder.itemView.findViewById(R.id.categories_name);
        categoryName.setText(Category.values()[position].getName());
    }

    @Override
    public int getItemCount() {
        return Category.values().length;
    }
}