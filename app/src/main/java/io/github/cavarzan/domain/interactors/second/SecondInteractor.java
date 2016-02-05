package io.github.cavarzan.domain.interactors.second;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseInteractor;

import javax.inject.Inject;

public class SecondInteractor extends BaseInteractor {

    @Inject
    public SecondInteractor(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
