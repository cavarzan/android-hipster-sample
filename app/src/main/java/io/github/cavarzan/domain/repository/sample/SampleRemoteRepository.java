package io.github.cavarzan.domain.repository.sample;

import javax.inject.Inject;

import retrofit2.Result;
import retrofit2.Retrofit;
import retrofit2.http.GET;

import rx.Observable;

public class SampleRemoteRepository {

    private final SampleService service;

    @Inject
    public SampleRemoteRepository(Retrofit retrofit) {
        this.service = retrofit.create(SampleService.class);
    }

    interface SampleService {
        @GET("api/foo")
        Observable<Result<Void>> foo();
    }
}
