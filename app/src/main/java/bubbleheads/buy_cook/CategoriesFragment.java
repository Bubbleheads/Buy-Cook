package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by melod on 29.03.2017.
 */

public class CategoriesFragment extends Fragment {
    private ArrayList<Category> categoryArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CategoriesAdapter categoriesAdapter;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categories_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        return view;


    }

    @Override
    public void onResume() {
        super.onResume();
        prepareCategoriesData();
        CategoriesAdapter mAdapter = new CategoriesAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }



    private void prepareCategoriesData() {



}
}
