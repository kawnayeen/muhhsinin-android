package com.kawnayeen.muhhsinin.presenter;

import com.kawnayeen.muhhsinin.model.SurahInfo;
import com.kawnayeen.muhhsinin.repository.SurahInfoRepository;
import com.kawnayeen.muhhsinin.view.AyatSelectionView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Single;

import static org.mockito.Mockito.*;

/**
 * Created by kawnayeen on 3/24/17.
 */
public class AyatSelectionPresenterTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private SurahInfoRepository surahInfoRepository;

    @Mock
    private AyatSelectionView ayatSelectionView;

    private AyatSelectionPresenter selectionPresenter;

    private final List<SurahInfo> SURAH_INFOS = Arrays.asList(new SurahInfo(), new SurahInfo(), new SurahInfo());

    @Before
    public void setup() {
        selectionPresenter = new AyatSelectionPresenter(surahInfoRepository, ayatSelectionView);
    }

    @Test
    public void shouldPassSurahInfosToView() {
        when(surahInfoRepository.getAllSurahInfo()).thenReturn(Single.just(SURAH_INFOS));
        selectionPresenter.loadSurahInfos();
        verify(ayatSelectionView).displaySurahSelection(SURAH_INFOS);
    }

    @Test
    public void shouldHandleError() {
        when(surahInfoRepository.getAllSurahInfo()).thenReturn(Single.error(new RuntimeException("Error in API")));
        selectionPresenter.loadSurahInfos();
        verify(ayatSelectionView).displaySurahInfoError();
    }
}