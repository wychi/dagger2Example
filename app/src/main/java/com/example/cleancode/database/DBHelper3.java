package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Inject;

/**
 * Helper with activity context
 */
public class DBHelper3 {
    private static final String TAG = "DBHelper3";

    @Inject
    public DBHelper3(Context context) {
        Log.d(TAG, "DBHelper3 injected ID=" + hashCode() + " , context=" + context);
    }
}
