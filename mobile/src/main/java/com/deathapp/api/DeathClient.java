package com.deathapp.api;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by ZkHaider on 6/6/15.
 */
public class DeathClient {

    private static final String TAG = DeathClient.class.getSimpleName();
    private static final String API_URL = "http://88194934.ngrok.io";
    private static DeathClient mDeathClient;
    private static RestAdapter mAsyncAdapter;

    private DeathClient() {
        mAsyncAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
    }

    public static DeathClient getInstance() {
        if (mDeathClient == null)
            mDeathClient = new DeathClient();
        return mDeathClient;
    }



}
