package com.deathapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.deathapp.R;

/**
 * Created by ZkHaider on 6/6/15.
 */
public class SplashActivity extends Activity {

    private ImageView mDeathLogo;
    // Set the display time, in milliseconds (or extract it out as a configurable parameter)
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        mDeathLogo = (ImageView) findViewById(R.id.deathAppLogo);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openMainActivity =  new Intent(SplashActivity.this, MainActivity.class);
                startActivity(openMainActivity);
                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
