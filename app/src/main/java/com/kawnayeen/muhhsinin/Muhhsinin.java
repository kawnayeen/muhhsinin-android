package com.kawnayeen.muhhsinin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kawnayeen.muhhsinin.model.SurahInfo;
import com.kawnayeen.muhhsinin.repository.providers.restapi.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Muhhsinin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhhsinin);
        Call<List<SurahInfo>> surahInfos = RestClient.getEndPoints().getSurahInfos();
        surahInfos.enqueue(new Callback<List<SurahInfo>>() {
            @Override
            public void onResponse(Call<List<SurahInfo>> call, Response<List<SurahInfo>> response) {
                response.body().stream().forEach(info -> Log.d("Test", info.toString()));
            }

            @Override
            public void onFailure(Call<List<SurahInfo>> call, Throwable t) {

            }
        });
    }
}
