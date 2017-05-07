package bubbleheads.buy_cook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashFragment extends Activity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash_fragment);
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}