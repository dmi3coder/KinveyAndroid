package com.dmi3coder.fsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kinvey.android.Client;
import com.kinvey.android.callback.KinveyPingCallback;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Client client = new Client.Builder("kid_bkhgi8I2xW",//APP_ID
                "1bac15b6ea3f40e08ec674fd67a83454",//APP_SECRET
                getApplicationContext()).build();
        client.ping(new KinveyPingCallback() {
            @Override
            public void onSuccess(Boolean aBoolean) {
                Toast.makeText(LoginActivity.this, "Our ping is fine!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
    }
}
