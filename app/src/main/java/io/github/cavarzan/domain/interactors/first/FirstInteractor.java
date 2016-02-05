package io.github.cavarzan.domain.interactors.first;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseInteractor;

import javax.inject.Inject;

public class FirstInteractor extends BaseInteractor {

    @Inject
    public FirstInteractor(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
