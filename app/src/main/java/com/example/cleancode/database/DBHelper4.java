package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * Helper with unsolvable types. Need to be provided in modules.
 */
public class DBHelper4 {
    private static final String TAG = "DBHelper4";

    @Inject
    public DBHelper4(Context context, String defaultPath) {
        Log.d(TAG, "DBHelper4 injected ID=" + hashCode() + " , context=" + context + " path=" + defaultPath);
    }
}
