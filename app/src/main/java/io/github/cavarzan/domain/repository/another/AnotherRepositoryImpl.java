package io.github.cavarzan.domain.repository.another;

public class AnotherRepositoryImpl implements AnotherRepository {

    AnotherLocalRepository localRepository;

    AnotherRemoteRepository remoteRepository;

    public AnotherRepositoryImpl(AnotherRemoteRepository remoteRepository , AnotherLocalRepository localRepository) {
        this.remoteRepository = remoteRepository; 
        this.localRepository = localRepository; 
    }


}
