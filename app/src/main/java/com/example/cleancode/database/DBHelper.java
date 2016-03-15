package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

public class DBHelper {

    private static final String TAG = "DBHelper";

    Context mActivityContxt;

    Context mAppContext;

    public DBHelper() {
        Log.d(TAG, "DBHelper ctor ID=" + hashCode() );
    }

    public void dump() {
        Log.d(TAG, "DBHelper injected ID=" + hashCode());
        Log.d(TAG, "mActivityContxt " + mActivityContxt);
        Log.d(TAG, "mAppContxt " + mAppContext);
    }

    public void setAppContext(Context context) {
        mAppContext = context;
    }

    public void setActivityContext(Context context) {
        mActivityContxt = context;
    }
}
