package com.rbk.ish_tops;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;

import com.rbk.ish_tops.api_services.RetrofitInstance;
import com.rbk.ish_tops.api_services.StocksApiService;
import com.rbk.ish_tops.models.MainResponse;
import com.rbk.ish_tops.models.TopGainer;
import com.rbk.ish_tops.models.TopLoser;
import com.rbk.ish_tops.models.TrendingStocks;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class StockRepository {
    // used to abstract the data source details and provides a clean API for the ViewModel
    //to fetch and manage data
    // single place for managing and data
    // mediator bridge between viewmodel and data layer


    private MutableLiveData<TrendingStocks> trendingStocksLiveData;
    private Application application;

    public StockRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<TrendingStocks> getTrendingStocks(){


        StocksApiService stocksApiService= RetrofitInstance.getServices();

        Call<MainResponse> call =stocksApiService.
                getTrendingStocks(application.getApplicationContext().getString(R.string.api_key),application.getApplicationContext().getString(R.string.api_host));

        call.enqueue(new Callback<MainResponse>() {
            @Override
            public void onResponse(Call<MainResponse> call, Response<MainResponse> response) {

                MainResponse mainResponse=response.body();

                if (mainResponse!=null && mainResponse.getTrendingStocks()!=null){


                    trendingStocksLiveData.setValue(mainResponse.getTrendingStocks().getValue());
                }

            }

            @Override
            public void onFailure(Call<MainResponse> call, Throwable t) {

            }
        });

        return trendingStocksLiveData;
    }
}
