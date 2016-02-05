package io.github.cavarzan.ui.sample;

import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.ui.base.BasePresenter;

import javax.inject.Inject;

@ActivityScope
public class SamplePresenter extends BasePresenter<SampleView> {

    @Inject
    public SamplePresenter() {

    }

}
