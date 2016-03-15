package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

/**
 * Helper with activity context
 */
public class DBHelper3 {
    private static final String TAG = "DBHelper3";

    public DBHelper3(Context context) {
        Log.d(TAG, "DBHelper3 injected ID=" + hashCode() + " , context=" + context);
    }
}
