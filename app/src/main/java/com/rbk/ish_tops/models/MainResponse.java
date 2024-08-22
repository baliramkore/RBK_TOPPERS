
package com.rbk.ish_tops.models;


import androidx.lifecycle.MutableLiveData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainResponse {


    // Annotation provided to serialise java objects as per response names
    @SerializedName("trending_stocks")
    @Expose
    private MutableLiveData<TrendingStocks> trendingStocks;

    public MutableLiveData<TrendingStocks> getTrendingStocks() {
        return trendingStocks;
    }

    public void setTrendingStocks(MutableLiveData<TrendingStocks> trendingStocks) {
        this.trendingStocks = trendingStocks;
    }
}
