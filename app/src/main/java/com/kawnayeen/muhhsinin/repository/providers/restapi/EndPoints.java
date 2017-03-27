package com.kawnayeen.muhhsinin.repository.providers.restapi;

import com.kawnayeen.muhhsinin.model.AyatInfo;
import com.kawnayeen.muhhsinin.model.SurahInfo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by kawnayeen on 3/24/17.
 */

public interface EndPoints {
    @GET("resources/surah.list.json")
    Single<List<SurahInfo>> getSurahInfos();

    @GET("resources/ayat/{surahId}/{ayatId}")
    Single<AyatInfo> getAyatInfo(@Path("surahId") String surahId, @Path("ayatId") String ayatId);
}
