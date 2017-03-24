package com.kawnayeen.muhhsinin.repository.providers.restapi;

import com.kawnayeen.muhhsinin.model.SurahInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kawnayeen on 3/24/17.
 */

public interface EndPoints {
    @GET("resources/surah.list.json")
    Call<List<SurahInfo>> getSurahInfos();
}
