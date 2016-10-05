package com.example.abhijeet_pal.weather.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by abhijeet_pal on 05-Oct-16.
 */
public class SunshineAuthenticatorService extends Service {
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new SunshineAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
