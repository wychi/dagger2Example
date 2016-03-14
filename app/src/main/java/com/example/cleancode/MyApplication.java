package com.example.cleancode;

import android.app.Application;
import android.util.Log;

import com.example.cleancode.database.DBHelper;
import com.example.cleancode.di.components.ApplicationComponent;
import com.example.cleancode.di.components.DaggerApplicationComponent;
import com.example.cleancode.di.modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by user on 16/3/14.
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    private ApplicationComponent component;

    @Inject
    DBHelper mHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);

        if(mHelper != null) {
            Log.d(TAG, "mHelper injected ID=" + mHelper.hashCode());
        }
    }

    public ApplicationComponent component() {
        return component;
    }
}
