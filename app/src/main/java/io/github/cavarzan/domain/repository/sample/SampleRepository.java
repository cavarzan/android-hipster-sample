package io.github.cavarzan.domain.repository.sample;

import javax.inject.Inject;

public class SampleRepository {

    @Inject
    SampleLocalRepository localRepository;

    @Inject
    SampleRemoteRepository remoteRepository;

    @Inject
    public SampleRepository() { }

  }
