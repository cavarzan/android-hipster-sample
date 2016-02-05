package io.github.cavarzan.domain.interactors.first;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseInteractor;

public class FirstInteractorImpl extends BaseInteractor implements FirstInteractor {

    public FirstInteractorImpl(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
