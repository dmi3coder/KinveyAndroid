package com.dmi3coder.fsearch;

import android.app.Application;

import com.kinvey.android.Client;

/**
 * Created by dmi3coder on 19/05/16 22:56.
 */
public class MainApplication extends Application {
    private Client client;
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

    public Client getClient(){
        return client;
    }
}
