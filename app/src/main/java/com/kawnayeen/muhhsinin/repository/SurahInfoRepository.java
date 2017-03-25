package com.kawnayeen.muhhsinin.repository;

import com.kawnayeen.muhhsinin.model.SurahInfo;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by kawnayeen on 3/24/17.
 */

public interface SurahInfoRepository {
    Single<List<SurahInfo>> getAllSurahInfo();
}
