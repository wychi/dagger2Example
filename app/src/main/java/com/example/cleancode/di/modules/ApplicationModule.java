package com.example.cleancode.di.modules;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

import com.example.cleancode.MyApplication;
import com.example.cleancode.database.DBHelper;
import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final MyApplication mApplication;

    HandlerThread mBGHandlerThread;
    Handler mUIHandler;
    Handler mBGHandler;

    public ApplicationModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    @Named("io")
    Handler provideBGHandler() {
        if(mBGHandler == null) {
            mBGHandlerThread = new HandlerThread("BG");
            mBGHandlerThread.start();
            mBGHandler = new Handler(mBGHandlerThread.getLooper());
        }
        return mBGHandler;
    }

    @Provides
    @Singleton
    @Named("ui")
    Handler provideUIHandler() {
        if(mUIHandler == null) {
            mUIHandler = new Handler();
        }
        return mUIHandler;
    }
}
