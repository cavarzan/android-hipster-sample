package io.github.cavarzan.domain.repository.another;

import javax.inject.Inject;

import retrofit2.Result;
import retrofit2.Retrofit;
import retrofit2.http.GET;

import rx.Observable;

public class AnotherRemoteRepository {

    private final AnotherService service;

    
    public AnotherRemoteRepository(Retrofit retrofit) {
        this.service = retrofit.create(AnotherService.class);
    }

    interface AnotherService {
        @GET("api/foo")
        Observable<Result<Void>> foo();
    }
}
