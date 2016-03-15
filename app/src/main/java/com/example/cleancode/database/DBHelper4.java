package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

/**
 * Helper with unsolvable types. Need to be provided in modules.
 */
public class DBHelper4 {
    private static final String TAG = "DBHelper4";

    static DBHelper4 sInst;
    public static DBHelper4 getInstance(Context context) {
        if(sInst == null) {
            sInst = new DBHelper4(context.getApplicationContext(), "singleton");
        }
        return sInst;
    }

    public DBHelper4(Context context, String defaultPath) {
        Log.d(TAG, "DBHelper4 injected ID=" + hashCode() + " , context=" + context + " path=" + defaultPath);
    }

    public void dump() {
        Log.d(TAG, "[dump] DBHelper4 injected ID=" + hashCode());
    }
}
