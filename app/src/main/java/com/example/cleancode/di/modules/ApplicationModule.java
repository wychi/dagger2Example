package com.example.cleancode.di.modules;

import android.content.Context;

import com.example.cleancode.MyApplication;
import com.example.cleancode.database.DBHelper;

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
    Context provideContext() {
        return mApplication;
    }

    @Provides
    DBHelper provideDBHelper(Context context) {
        return new DBHelper(context);
    }
}
