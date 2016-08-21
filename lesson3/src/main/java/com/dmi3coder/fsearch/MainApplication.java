package com.dmi3coder.fsearch;

import android.app.Application;

import com.kinvey.android.Client;


public class MainApplication extends Application {
    private static Client client;

    @Override
    public void onCreate() {
        super.onCreate();
        defineClient();
    }

    private void defineClient() {
        client = new Client.Builder("kid_bkhgi8I2xW",//APP_ID
                "1bac15b6ea3f40e08ec674fd67a83454",//APP_SECRET
                getApplicationContext()).build();
    }

    public static Client getClient(){
        return client;
    }
}
