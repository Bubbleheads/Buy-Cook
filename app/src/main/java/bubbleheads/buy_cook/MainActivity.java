package bubbleheads.buy_cook;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Recipe detailedRecipe;
    private Fragment currentFragment;
    private static int count = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  showFragment(new TabLayoutFragment());
        if (savedInstanceState == null) {
           showFragment(new TabLayoutFragment());
          //  getFragmentManager().beginTransaction()
            //        .add(R.id.container, new PlaceholderFragment()).commit();
        }
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
        if (count != 0) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
        count++;
    }
}