package io.github.cavarzan.domain.usecases.second;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseUseCase;

public class SecondUseCaseImpl extends BaseUseCase implements SecondUseCase {

    public SecondUseCaseImpl(ThreadExecutor executor) {
        super(executor);
    }

    @Override
    public void invoke() {
        // TODO
    }

}
