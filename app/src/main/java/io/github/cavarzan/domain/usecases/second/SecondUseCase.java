package io.github.cavarzan.domain.usecases.second;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseUseCase;

import javax.inject.Inject;

public class SecondUseCase extends BaseUseCase  {

    @Inject
    public SecondUseCase(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
