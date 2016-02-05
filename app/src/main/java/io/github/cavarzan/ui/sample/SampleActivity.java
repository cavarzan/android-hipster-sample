package io.github.cavarzan.ui.sample;

import android.os.Bundle;
import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.di.HasComponent;
import io.github.cavarzan.ui.base.BaseActivity;
import io.github.cavarzan.R;
import io.github.cavarzan.application.App;

import io.github.cavarzan.di.components.DaggerSampleComponent;
import io.github.cavarzan.di.components.SampleComponent;
import io.github.cavarzan.di.modules.SampleModule;

import nucleus.factory.PresenterFactory; 

import javax.inject.Inject;

@ActivityScope
public class SampleActivity extends BaseActivity<SamplePresenter> implements SampleView, HasComponent<SampleComponent> {

    @Inject
    SamplePresenter samplePresenter;

    SampleComponent component;

    protected void injectModule() {
        component = DaggerSampleComponent.builder().applicationComponent(App.graph).sampleModule(new SampleModule(this)).build();
        component.inject(this);
    }
      
    public PresenterFactory<SamplePresenter> getPresenterFactory() {
        return () -> samplePresenter;
    }

    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
    }

    protected int getLayoutResource() {
        return R.layout.activity_sample;
    }

    @Override
    public SampleComponent getComponent() {
        return component;
    }

}
