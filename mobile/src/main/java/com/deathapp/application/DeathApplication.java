package com.deathapp.application;

import android.app.Application;

import com.deathapp.bus.BusProvider;
import com.deathapp.manager.DeathManager;
import com.squareup.otto.Bus;

/**
 * Created by ZkHaider on 6/6/15.
 */
public class DeathApplication extends Application {

    private Bus mBus = BusProvider.getInstance();
    private DeathManager mDeathManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mDeathManager = new DeathManager(this, mBus);
        mBus.register(mDeathManager);
        mBus.register(this);
    }
}
