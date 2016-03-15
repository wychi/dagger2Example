package com.example.cleancode.di.components;

import android.content.Context;
import android.os.Handler;

import com.example.cleancode.MyApplication;
import com.example.cleancode.di.modules.ApplicationModule;
import com.example.cleancode.di.scopes.ForApplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Singleton objects are sit here.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MyApplication application);

    @ForApplication
    Context appContext();

    @Named("io")
    Handler provideBGHandler();

    @Named("ui")
    Handler provideUIHandler();
}
