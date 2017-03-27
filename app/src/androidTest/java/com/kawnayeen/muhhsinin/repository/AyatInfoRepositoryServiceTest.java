package com.kawnayeen.muhhsinin.repository;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by kawnayeen on 3/27/17.
 */
@RunWith(AndroidJUnit4.class)
public class AyatInfoRepositoryServiceTest {
    @Test
    public void shouldGetAyatInfo() {
        AyatInfoRepositoryService ayatService = new AyatInfoRepositoryService();
        ayatService.getAyatInfo("001", "001001").subscribe(ayatInfo -> {
            Assert.assertEquals(1, ayatInfo.getId());
            Assert.assertEquals("In the Name of Allah, the Most Beneficent, the Most Merciful.", ayatInfo.getEnglish());
        });
    }

}