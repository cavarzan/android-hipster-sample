package io.github.cavarzan.domain.repository.second;

import javax.inject.Inject;

public class SecondRepository {

    @Inject
    SecondLocalRepository localRepository;

    @Inject
    SecondRemoteRepository remoteRepository;

    @Inject
    public SecondRepository() { }

  }
