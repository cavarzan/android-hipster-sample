package io.github.cavarzan.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;
import com.google.gson.Gson;

import de.greenrobot.event.EventBus;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import io.github.cavarzan.application.App;
import io.github.cavarzan.di.ForApplication;
import io.github.cavarzan.storage.Storage;
import io.github.cavarzan.domain.executors.JobExecutor;
import io.github.cavarzan.domain.executors.ThreadExecutor;

import io.github.cavarzan.domain.interactors.second.SecondInteractor;
import io.github.cavarzan.domain.interactors.second.SecondInteractorImpl;
import io.github.cavarzan.domain.usecases.first.FirstUseCase;
import io.github.cavarzan.domain.usecases.first.FirstUseCaseImpl;
import io.github.cavarzan.domain.usecases.second.SecondUseCase;
import io.github.cavarzan.domain.usecases.second.SecondUseCaseImpl;
import io.github.cavarzan.domain.repository.another.*;
// android-hipster-needle-module-provides-import

@Module
public class ApplicationModule {

    protected App application;

    public ApplicationModule(App application) {
        this.application = application;
    }

    @ForApplication
    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }

    @ForApplication
    @Provides
    @Singleton
    public Context provideContext() {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    public ThreadExecutor provideThreadExecutor() {
        return new JobExecutor();
    }

    @Provides
    @Singleton
    Storage provideStorage(Gson gson, SharedPreferences preferences) {
        return new Storage(preferences, gson);
    }

    

    @Provides
    @Singleton
    EventBus provideBus() {
        return EventBus.getDefault();
    }


    @Provides
    @Singleton
    SecondInteractor provideSecondInteractor(ThreadExecutor executor) {
       return new SecondInteractorImpl(executor);
    }
    @Provides
    @Singleton
    FirstUseCase provideFirstUseCase(ThreadExecutor executor) {
       return new FirstUseCaseImpl(executor);
    }
    @Provides
    @Singleton
    SecondUseCase provideSecondUseCase(ThreadExecutor executor) {
       return new SecondUseCaseImpl(executor);
    }
    @Provides
    @Singleton
    AnotherRepository provideAnotherRepository(Retrofit retrofit) {
       return new AnotherRepositoryImpl(new AnotherRemoteRepository(retrofit), new AnotherLocalRepository());
    }
    // android-hipster-needle-module-provides-method

}
