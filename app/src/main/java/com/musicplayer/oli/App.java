package com.musicplayer.oli;

import android.app.Application;
import android.util.Log;

/**
 * Created by Oli on 29/06/2017.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Oli", "Test message");
    }
}
