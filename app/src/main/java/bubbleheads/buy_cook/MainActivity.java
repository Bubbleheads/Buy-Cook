package bubbleheads.buy_cook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Recipe detailedRecipe;
    private Fragment currentFragment;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment(new TabLayoutFragment());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setDetailedRecipe(final Recipe recipe) {
        detailedRecipe = recipe;
    }

    public Recipe getDetailedRecipe() {
        return detailedRecipe;
    }

    public void showFragment(final Fragment fragment) {
        currentFragment = fragment;

        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}