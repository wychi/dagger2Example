package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Inject;

public class DBHelper {

    private static final String TAG = "DBHelper";

    @Inject
    Context mActivityContxt;

    @Inject @ForApplication
    Context mAppContext;

    @Inject
    public DBHelper() {
        Log.d(TAG, "DBHelper ctor ID=" + hashCode() );
    }

    public void dump() {
        Log.d(TAG, "DBHelper injected ID=" + hashCode());
        Log.d(TAG, "mActivityContxt " + mActivityContxt);
        Log.d(TAG, "mAppContxt " + mAppContext);
    }
}
