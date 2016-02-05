package io.github.cavarzan.domain.interactors.second;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseInteractor;
import io.github.cavarzan.domain.repository.first.FirstRepository;
import io.github.cavarzan.domain.repository.second.SecondRepository;

import javax.inject.Inject;

public class SecondInteractor extends BaseInteractor {

    @Inject
    FirstRepository firstRepository;

    @Inject
    SecondRepository secondRepository;

    @Inject
    public SecondInteractor(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
