package com.kawnayeen.muhhsinin.repository;

import com.kawnayeen.muhhsinin.model.AyatInfo;

import io.reactivex.Single;

/**
 * Created by kawnayeen on 3/27/17.
 */

public interface AyatInfoRepository {
    Single<AyatInfo> getAyatInfo(String surahId, String ayatId);
}
