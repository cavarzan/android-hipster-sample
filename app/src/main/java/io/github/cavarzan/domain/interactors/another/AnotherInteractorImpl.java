package io.github.cavarzan.domain.interactors.another;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseInteractor;

public class AnotherInteractorImpl extends BaseInteractor implements AnotherInteractor {

    public AnotherInteractorImpl(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
