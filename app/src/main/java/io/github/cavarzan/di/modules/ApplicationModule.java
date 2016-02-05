package io.github.cavarzan.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;
import io.github.cavarzan.application.App;
import io.github.cavarzan.di.ForApplication;
import io.github.cavarzan.domain.executors.JobExecutor;
import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.second.SecondInteractor;
import io.github.cavarzan.domain.interactors.second.SecondInteractorImpl;
import io.github.cavarzan.domain.repository.another.AnotherLocalRepository;
import io.github.cavarzan.domain.repository.another.AnotherRemoteRepository;
import io.github.cavarzan.domain.repository.another.AnotherRepository;
import io.github.cavarzan.domain.repository.another.AnotherRepositoryImpl;
import io.github.cavarzan.domain.usecases.first.FirstUseCase;
import io.github.cavarzan.domain.usecases.first.FirstUseCaseImpl;
import io.github.cavarzan.storage.Storage;
import retrofit2.Retrofit;
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
    AnotherRepository provideAnotherRepository(Retrofit retrofit) {
       return new AnotherRepositoryImpl(new AnotherRemoteRepository(retrofit), new AnotherLocalRepository());
    }
    // android-hipster-needle-module-provides-method

}
