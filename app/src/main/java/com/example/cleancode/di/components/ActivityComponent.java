package com.example.cleancode.di.components;

import com.example.cleancode.MainActivity;
import com.example.cleancode.di.modules.ActivityModule;
import com.example.cleancode.di.scopes.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}
