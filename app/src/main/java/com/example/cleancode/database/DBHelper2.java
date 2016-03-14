package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Inject;

/**
 * Helper with application context
 */
public class DBHelper2 {

    private static final String TAG = "DBHelper2";

    @Inject
    public DBHelper2(@ForApplication Context context) {
        Log.d(TAG, "DBHelper2 injected ID=" + hashCode() + " , context=" + context);
    }
}
