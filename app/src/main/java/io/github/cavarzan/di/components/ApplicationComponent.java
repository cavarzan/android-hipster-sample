package io.github.cavarzan.di.components;

import android.content.Context;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import io.github.cavarzan.application.App;
import io.github.cavarzan.di.ForApplication;
import io.github.cavarzan.di.components.DaggerApplicationComponent;
import io.github.cavarzan.di.modules.AndroidModule;
import io.github.cavarzan.di.modules.ApplicationModule;
import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.environment.EnvironmentModule;
import io.github.cavarzan.services.push.PushIntentService;
import io.github.cavarzan.services.push.PushServiceListener;
import io.github.cavarzan.storage.Storage;
import io.github.cavarzan.util.gson.GsonModule;
import retrofit2.Retrofit;
// android-hipster-needle-component-injection-import

@Singleton
@Component(modules = {ApplicationModule.class, AndroidModule.class, GsonModule.class, EnvironmentModule.class})
public interface ApplicationComponent {

    ThreadExecutor provideThreadExecutor();

    Storage provideStorage();

    Retrofit provideRetrofit();

    @ForApplication
    Context provideContext();

    Gson provideGson();

    void inject(App app);

    void inject(PushServiceListener pushServiceListener);
    void inject(PushIntentService pushIntentService);
    // android-hipster-needle-component-injection-method

    final class Initializer {
          public static ApplicationComponent init(App app) {
              return DaggerApplicationComponent.builder()
                            .androidModule(new AndroidModule())
                            .gsonModule(new GsonModule())
                            .applicationModule(new ApplicationModule(app))
                            .environmentModule(new EnvironmentModule(app))
                            .build();
          }
      }

}
