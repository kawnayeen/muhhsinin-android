package com.kawnayeen.muhhsinin.repository.providers.restapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kawnayeen on 3/24/17.
 */

public class RestClient {
    private static final String BASE_URL = "https://muhhsinin.github.io/";
    private static EndPoints endPoints = null;

    private static void constructEndPoint() {
        OkHttpClient httpClient = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        endPoints = retrofit.create(EndPoints.class);
    }

    public static EndPoints getEndPoints() {
        if (endPoints == null)
            constructEndPoint();
        return endPoints;
    }
}
