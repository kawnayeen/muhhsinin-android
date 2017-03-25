package com.kawnayeen.muhhsinin.repository.providers.restapi;

import com.kawnayeen.muhhsinin.model.SurahInfo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by kawnayeen on 3/24/17.
 */

public interface EndPoints {
    @GET("resources/surah.list.json")
    Single<List<SurahInfo>> getSurahInfos();
}
