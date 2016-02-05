package io.github.cavarzan.domain.repository.first;

import javax.inject.Inject;

import retrofit2.Result;
import retrofit2.Retrofit;
import retrofit2.http.GET;

import rx.Observable;

public class FirstRemoteRepository {

    private final FirstService service;

    
    public FirstRemoteRepository(Retrofit retrofit) {
        this.service = retrofit.create(FirstService.class);
    }

    interface FirstService {
        @GET("api/foo")
        Observable<Result<Void>> foo();
    }
}
