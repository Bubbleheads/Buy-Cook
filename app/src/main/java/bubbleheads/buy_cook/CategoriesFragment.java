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

public class CategoriesFragment extends Fragment {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.categories_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        final CategoriesAdapter adapter = new CategoriesAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
