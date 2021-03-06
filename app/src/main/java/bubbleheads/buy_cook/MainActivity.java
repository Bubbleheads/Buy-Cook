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
    private static boolean activityPass;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment(new TabLayoutFragment());
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
        if (activityPass) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
        activityPass = true;
    }
}