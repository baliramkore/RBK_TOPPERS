package com.rbk.ish_tops.api_services;

import com.rbk.ish_tops.models.MainResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StocksApiService {

    //The Service interface defines structure and behaviours of the API Request
    // It Acts as a bridge between your API and App


    @GET("/trending")
    Call<MainResponse> getTrendingStocks(@Query("x-rapidapi-key")String apiKey, @Query("x-rapidapi-host")String apiHost);
}
