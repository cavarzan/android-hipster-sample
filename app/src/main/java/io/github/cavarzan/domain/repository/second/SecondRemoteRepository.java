package io.github.cavarzan.domain.repository.second;

import javax.inject.Inject;

import retrofit2.Result;
import retrofit2.Retrofit;
import retrofit2.http.GET;

import rx.Observable;

public class SecondRemoteRepository {

    private final SecondService service;

    @Inject
    public SecondRemoteRepository(Retrofit retrofit) {
        this.service = retrofit.create(SecondService.class);
    }

    interface SecondService {
        @GET("api/foo")
        Observable<Result<Void>> foo();
    }
}
