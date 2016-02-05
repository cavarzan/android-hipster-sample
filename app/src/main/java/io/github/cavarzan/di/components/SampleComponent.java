package io.github.cavarzan.di.components;

import dagger.Component;
import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.di.modules.SampleModule;
import io.github.cavarzan.ui.sample.SampleActivity;
import io.github.cavarzan.ui.sample.SampleFragment;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {SampleModule.class})
public interface SampleComponent {

    void inject(SampleActivity activity);
    void inject(SampleFragment fragment); 

}
