package com.kawnayeen.muhhsinin.repository;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by kawnayeen on 3/25/17.
 */
@RunWith(AndroidJUnit4.class)
public class SurahInfoRepositoryServiceTest {
    @Test
    public void shouldGetSurahInfos() {
        SurahInfoRepositoryService surahRepository = new SurahInfoRepositoryService();
        surahRepository.getAllSurahInfo().subscribe(surahInfos -> {
            assertEquals(114, surahInfos.size());
        });
    }
}