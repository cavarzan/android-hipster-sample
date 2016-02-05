package io.github.cavarzan.domain.repository.first;

public class FirstRepositoryImpl implements FirstRepository {

    FirstLocalRepository localRepository;

    FirstRemoteRepository remoteRepository;

    public FirstRepositoryImpl(FirstRemoteRepository remoteRepository , FirstLocalRepository localRepository) {
        this.remoteRepository = remoteRepository; 
        this.localRepository = localRepository; 
    }


}
