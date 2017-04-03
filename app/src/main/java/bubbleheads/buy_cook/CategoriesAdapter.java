package bubbleheads.buy_cook;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Adapter;
import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends BaseAdapter {
    private CategoriesFragment categoriesFragment;
    private Context context;
    private ArrayList<Category> categoriesList = new ArrayList<>();

    public CategoriesAdapter( Context context,CategoriesFragment categoriesFragment) {
        for (Category category: Category.values()){
            categoriesList.add(category);
        }
        this.categoriesFragment = categoriesFragment;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.categories_cell, null);
        TextView categoriesName = (TextView) convertView.findViewById(R.id.categories_name);
        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return categoriesList.get(position);
    }

    @Override
    public int getCount() {
        return categoriesList.size();
    }

    @Override
    public boolean isEmpty(){
        return categoriesList.isEmpty();
    }
}
