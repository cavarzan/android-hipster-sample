package io.github.cavarzan.domain.usecases.first;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseUseCase;

public class FirstUseCaseImpl extends BaseUseCase implements FirstUseCase {

    public FirstUseCaseImpl(ThreadExecutor executor) {
        super(executor);
    }

    @Override
    public void invoke() {
        // TODO
    }

}
