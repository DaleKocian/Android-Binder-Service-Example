package com.example.app.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

/**
 * Created by dkocian on 11/16/13.
 */
public class LocalService extends Service {
    public static final int UPPER_BOUND = 100;
    // Binder given to clients
    private final IBinder mBinder = new LocalBinder();
    // Random number generator
    private final Random mGenerator = new Random();

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    // Method for clients
    public int getRandomNumber() {
        return mGenerator.nextInt(UPPER_BOUND);
    }

    // Method for clients
    public int getNumber(int num) {
        return num;
    }

    public class LocalBinder extends Binder {
        public LocalService getService() {
            // Return this instance of LocalService so clients can call public methods
            return LocalService.this;
        }
    }
}
