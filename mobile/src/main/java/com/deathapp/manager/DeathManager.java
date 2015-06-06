package com.deathapp.manager;

import android.content.Context;

import com.deathapp.api.DeathClient;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

/**
 * Created by ZkHaider on 6/6/15.
 */
public class DeathManager {

    private static final String TAG = DeathManager.class.getSimpleName();

    private DeathClient sClient;
    private Bus mBus;
    private Context mContext;

    public DeathManager(Context context, Bus bus) {
        this.mContext = context;
        this.mBus = bus;
        sClient = DeathClient.getInstance();
    }



}
