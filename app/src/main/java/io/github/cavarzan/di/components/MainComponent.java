package io.github.cavarzan.di.components;

import dagger.Component;
import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.di.modules.ApplicationModule;
import io.github.cavarzan.di.modules.MainModule;
import io.github.cavarzan.domain.usecases.first.FirstUseCase;
import io.github.cavarzan.ui.main.MainActivity;
import io.github.cavarzan.ui.main.MainFragment;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity activity);
    void inject(MainFragment fragment);

}
