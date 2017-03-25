package com.kawnayeen.muhhsinin.presenter;

import com.kawnayeen.muhhsinin.model.SurahInfo;
import com.kawnayeen.muhhsinin.repository.SurahInfoRepository;
import com.kawnayeen.muhhsinin.view.AyatSelectionView;

import java.util.List;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;

/**
 * Created by kawnayeen on 3/24/17.
 */

public class AyatSelectionPresenter {
    private final SurahInfoRepository surahInfoRepository;
    private final AyatSelectionView ayatSelectionView;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public AyatSelectionPresenter(SurahInfoRepository surahInfoRepository, AyatSelectionView ayatSelectionView) {
        this.surahInfoRepository = surahInfoRepository;
        this.ayatSelectionView = ayatSelectionView;
    }

    public void loadSurahInfos() {
        surahInfoRepository.getAllSurahInfo().subscribeWith(new DisposableSingleObserver<List<SurahInfo>>() {
            @Override
            public void onSuccess(List<SurahInfo> surahInfos) {
                ayatSelectionView.displaySurahSelection(surahInfos);
            }

            @Override
            public void onError(Throwable e) {
                ayatSelectionView.displaySurahInfoError();
            }
        });
//        try {
//            List<SurahInfo> surahInfos = surahInfoRepository.getAllSurahInfo();
//            ayatSelectionView.displaySurahSelection(surahInfos);
//        } catch (RuntimeException e) {
//            ayatSelectionView.displaySurahInfoError();
//        }
    }
}
