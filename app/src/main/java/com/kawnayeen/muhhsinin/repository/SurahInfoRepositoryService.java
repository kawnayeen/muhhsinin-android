package com.kawnayeen.muhhsinin.repository;

import com.kawnayeen.muhhsinin.model.SurahInfo;
import com.kawnayeen.muhhsinin.repository.providers.restapi.RestClient;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kawnayeen on 3/25/17.
 */

public class SurahInfoRepositoryService implements SurahInfoRepository {
    @Override
    public Single<List<SurahInfo>> getAllSurahInfo() {
        return RestClient.getEndPoints()
                .getSurahInfos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
