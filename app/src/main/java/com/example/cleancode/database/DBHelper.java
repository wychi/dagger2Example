package com.example.cleancode.database;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class DBHelper {

    @Inject
    public DBHelper(Context context) {
        Log.d("DBHelper", "ctor. context " + context);
    }
}
