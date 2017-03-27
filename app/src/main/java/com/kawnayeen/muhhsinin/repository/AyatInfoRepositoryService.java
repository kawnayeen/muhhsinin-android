package com.kawnayeen.muhhsinin.repository;

import com.kawnayeen.muhhsinin.model.AyatInfo;
import com.kawnayeen.muhhsinin.repository.providers.restapi.RestClient;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kawnayeen on 3/27/17.
 */

public class AyatInfoRepositoryService implements AyatInfoRepository {
    @Override
    public Single<AyatInfo> getAyatInfo(String surahId, String ayatId) {
        return RestClient.getEndPoints()
                .getAyatInfo(surahId, ayatId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
