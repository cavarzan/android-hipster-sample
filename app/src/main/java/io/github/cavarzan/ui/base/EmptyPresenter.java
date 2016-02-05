package io.github.cavarzan.ui.base;

import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.ui.base.BasePresenter;
import javax.inject.Inject;

@ActivityScope
public class EmptyPresenter extends BasePresenter {

    @Inject
    public EmptyPresenter() {

    }

}
