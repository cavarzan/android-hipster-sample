package io.github.cavarzan.ui.main;

import android.os.Bundle;
import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.di.components.MainComponent;
import io.github.cavarzan.di.HasComponent;
import io.github.cavarzan.ui.base.BaseActivity;
import io.github.cavarzan.R;
import io.github.cavarzan.application.App;
import io.github.cavarzan.di.components.DaggerMainComponent;
import io.github.cavarzan.di.components.MainComponent;
import io.github.cavarzan.di.modules.MainModule;

import android.os.Bundle;

import nucleus.factory.PresenterFactory; 

import javax.inject.Inject;

@ActivityScope
public class MainActivity extends BaseActivity<MainPresenter> implements MainView, HasComponent<MainComponent> {

    @Inject
    MainPresenter mainPresenter;

    MainComponent component;

    protected void injectModule() {
        component = DaggerMainComponent.builder().applicationComponent(App.graph).mainModule(new MainModule(this)).build();
        component.inject(this);
    }
      
    public PresenterFactory<MainPresenter> getPresenterFactory() {
        return () -> mainPresenter;
    }

    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
    }

    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    public MainComponent getComponent() {
        return component;
    }

}
