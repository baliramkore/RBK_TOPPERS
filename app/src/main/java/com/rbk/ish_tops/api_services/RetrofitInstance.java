package com.rbk.ish_tops.api_services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    //Acts as an central configuration point for
    // defining how HTTP requests and responses should be handled
    //Base URL will be given here

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://indian-stock-exchange-api2.p.rapidapi.com";

    public static StocksApiService getServices() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }
        return retrofit.create(StocksApiService.class);

    }
}
