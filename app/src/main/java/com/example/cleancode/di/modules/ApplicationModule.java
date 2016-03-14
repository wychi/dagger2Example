package com.example.cleancode.di.modules;

import android.content.Context;

import com.example.cleancode.MyApplication;
import com.example.cleancode.database.DBHelper;
import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final MyApplication mApplication;

    public ApplicationModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideContext() {
        return mApplication;
    }
}
