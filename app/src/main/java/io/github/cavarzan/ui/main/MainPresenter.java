package io.github.cavarzan.ui.main;

import io.github.cavarzan.di.ActivityScope;
import io.github.cavarzan.domain.interactors.first.FirstInteractor;
import io.github.cavarzan.domain.interactors.second.SecondInteractor;
import io.github.cavarzan.domain.usecases.first.FirstUseCase;
import io.github.cavarzan.domain.usecases.second.SecondUseCase;
import io.github.cavarzan.ui.base.BasePresenter;

import javax.inject.Inject;

@ActivityScope
public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    FirstUseCase firstUseCase;

    @Inject
    SecondUseCase secondUseCase;

    @Inject
    FirstInteractor firstInteractor;

    @Inject
    SecondInteractor secondInteractor;

    @Inject
    public MainPresenter() {

    }

}
