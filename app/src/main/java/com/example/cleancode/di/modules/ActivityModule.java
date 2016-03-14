package com.example.cleancode.di.modules;

import android.app.Activity;
import android.content.Context;

import com.example.cleancode.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    Context provideContext() {
        return mActivity;
    }
}
