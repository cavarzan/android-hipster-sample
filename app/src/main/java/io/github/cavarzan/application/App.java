package io.github.cavarzan.application;

import android.app.Application;
import android.support.multidex.MultiDex;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import net.danlew.android.joda.JodaTimeAndroid; 
import com.github.johnkil.print.PrintConfig; 

import io.github.cavarzan.environment.EnvironmentConfiguration;
import io.github.cavarzan.R;
import io.github.cavarzan.di.components.ApplicationComponent;
import io.github.cavarzan.di.ForApplication;
import io.github.cavarzan.di.components.DaggerApplicationComponent;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig; 

public class App extends Application {

public static ApplicationComponent graph;

    private static RefWatcher refWatcher;

    @ForApplication
    @Inject
    Context context;

    @Inject
    EnvironmentConfiguration environmentConfiguration;

    private static App instance = null;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);
        instance = this;
        refWatcher = LeakCanary.install(this);

        JodaTimeAndroid.init(this); 
        PrintConfig.initDefault(getAssets(), "fonts/MaterialIcons-Regular.ttf");
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/Roboto-Regular.ttf").setFontAttrId(R.attr.fontPath).build()); 

        graph = createComponent();

        environmentConfiguration.configure();

    }

    public ApplicationComponent createComponent() {
        ApplicationComponent applicationComponent = ApplicationComponent.Initializer.init(this);

        applicationComponent.inject(this);
        return applicationComponent;
    }

    public static RefWatcher getRefWatcher() {
       return refWatcher;
    }


}
