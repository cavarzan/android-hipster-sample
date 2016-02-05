package io.github.cavarzan.di.modules;

import dagger.Module;
import dagger.Provides;
import  io.github.cavarzan.ui.main.MainActivity;

@Module
public class MainModule extends ActivityModule {

    public MainModule(MainActivity activity) {
        super(activity);
      }

}
