package com.example.cleancode.di.modules;

import android.app.Activity;
import android.content.Context;

import com.example.cleancode.database.DBHelper4;
import com.example.cleancode.di.scopes.PerActivity;

import javax.inject.Named;

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

    @Provides
    @Named("sdcard")
    DBHelper4 provideDBHelper4_1(Context context) {
        return new DBHelper4(context, "/sdcard");
    }

    @Provides
    @Named("appdata")
    DBHelper4 provideDBHelper4_2(Context context) {
        return new DBHelper4(context, "/data/data");
    }

    @Provides
    @Named("singleton")
    @PerActivity
    DBHelper4 provideDBHelper4_3(Context context) {
        return new DBHelper4(context, "/singleton");
    }

}
