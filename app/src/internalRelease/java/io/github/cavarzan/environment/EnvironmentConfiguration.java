package io.github.cavarzan.environment;

import android.app.Application;
import android.os.StrictMode;

import io.github.cavarzan.BuildConfig;
import io.github.cavarzan.di.ForApplication;

import javax.inject.Inject;
import javax.inject.Singleton;

import timber.log.Timber;
import io.github.cavarzan.util.logging.CrashReportingTree; 
import com.facebook.stetho.Stetho;

@Singleton
public class EnvironmentConfiguration {

    @Inject
    @ForApplication
    Application app;

    @Inject
    public EnvironmentConfiguration() {
    }

    public void configure() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
        Stetho.initializeWithDefaults(app);
        if (BuildConfig.DEBUG) {
               Timber.plant(new Timber.DebugTree());
        } else {
               Timber.plant(new CrashReportingTree());
        }
    }

}
