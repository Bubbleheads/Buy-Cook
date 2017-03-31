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

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{
    private CategoriesFragment categoriesFragment;
    private ArrayList<Category> categoriesList = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView text;

        public View itemView;


        public MyViewHolder(View view) {
            super(view);
            itemView = view;
            text = (TextView) view.findViewById(R.id.text);

        }
    }

    public CategoriesAdapter( CategoriesFragment categoriesFragment) {
        for (Category category: Category.values()){
            categoriesList.add(category);
        }
        this.categoriesFragment = categoriesFragment;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categories_cell, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.text.setText(categoriesList.get(position).getName());
    }
     @Override
        public int getItemCount() {
        return categoriesList.size();
    }
}
