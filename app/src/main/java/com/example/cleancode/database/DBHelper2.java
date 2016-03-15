package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

/**
 * Helper with application context
 */
public class DBHelper2 {

    private static final String TAG = "DBHelper2";

    public DBHelper2(Context context) {
        Log.d(TAG, "DBHelper2 injected ID=" + hashCode() + " , context=" + context);
    }
}
