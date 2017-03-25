package com.kawnayeen.muhhsinin.view;

import com.kawnayeen.muhhsinin.model.SurahInfo;

import java.util.List;

/**
 * Created by kawnayeen on 3/24/17.
 */

public interface AyatSelectionView {
    void displaySurahSelection(List<SurahInfo> surahInfos);

    void displaySurahInfoError();
}
