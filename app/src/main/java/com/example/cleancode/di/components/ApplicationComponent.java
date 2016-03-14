package com.example.cleancode.di.components;

import com.example.cleancode.MyApplication;
import com.example.cleancode.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Singleton objects are sit here.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MyApplication application);
}
