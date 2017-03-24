package com.kawnayeen.muhhsinin.presenter;

import com.kawnayeen.muhhsinin.model.SurahInfo;
import com.kawnayeen.muhhsinin.repository.SurahInfoRepository;
import com.kawnayeen.muhhsinin.view.AyatSelectionView;

import java.util.List;

/**
 * Created by kawnayeen on 3/24/17.
 */

public class AyatSelectionPresenter {
    private final SurahInfoRepository surahInfoRepository;
    private final AyatSelectionView ayatSelectionView;

    public AyatSelectionPresenter(SurahInfoRepository surahInfoRepository, AyatSelectionView ayatSelectionView) {
        this.surahInfoRepository = surahInfoRepository;
        this.ayatSelectionView = ayatSelectionView;
    }

    public void loadSurahInfos() {
        try {
            List<SurahInfo> surahInfos = surahInfoRepository.getAllSurahInfo();
            ayatSelectionView.displaySurahSelection(surahInfos);
        } catch (RuntimeException e) {
            ayatSelectionView.displaySurahInfoError();
        }
    }
}
