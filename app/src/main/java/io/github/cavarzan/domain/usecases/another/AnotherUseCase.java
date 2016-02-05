package io.github.cavarzan.domain.usecases.another;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseUseCase;

import javax.inject.Inject;

public class AnotherUseCase extends BaseUseCase  {

    @Inject
    public AnotherUseCase(ThreadExecutor executor) {
        super(executor);
    }

    public void invoke() {
        // TODO
    }

}
