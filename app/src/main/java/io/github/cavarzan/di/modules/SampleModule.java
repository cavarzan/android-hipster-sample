package io.github.cavarzan.di.modules;

import dagger.Module;
import dagger.Provides;
import io.github.cavarzan.ui.sample.SampleActivity;

@Module
public class SampleModule extends ActivityModule {

    public SampleModule(SampleActivity activity) {
        super(activity);
    }

}
