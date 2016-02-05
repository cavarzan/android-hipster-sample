package io.github.cavarzan.domain.usecases.another;

import io.github.cavarzan.domain.executors.ThreadExecutor;
import io.github.cavarzan.domain.interactors.base.BaseUseCase;

public class AnotherUseCaseImpl extends BaseUseCase implements AnotherUseCase {

    public AnotherUseCaseImpl(ThreadExecutor executor) {
        super(executor);
    }

    @Override
    public void invoke() {
        // TODO
    }

}
