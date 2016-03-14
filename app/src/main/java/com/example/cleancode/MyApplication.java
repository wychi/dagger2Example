package com.example.cleancode;

import android.app.Application;

import com.example.cleancode.di.components.ApplicationComponent;
import com.example.cleancode.di.components.DaggerApplicationComponent;
import com.example.cleancode.di.modules.ApplicationModule;

/**
 * Created by user on 16/3/14.
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return component;
    }
}
