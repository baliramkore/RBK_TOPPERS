
package com.rbk.ish_tops.models;

import androidx.lifecycle.LiveData;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrendingStocks {

    @SerializedName("top_gainers")
    @Expose
    private LiveData<List<TopGainer>> topGainers;
    @SerializedName("top_losers")
    @Expose
    private LiveData<List<TopLoser>> topLosers;

    public LiveData<List<TopGainer>> getTopGainers() {
        return topGainers;
    }

    public void setTopGainers( LiveData<List<TopGainer>> topGainers) {
        this.topGainers = topGainers;
    }

    public LiveData<List<TopLoser>> getTopLosers() {
        return topLosers;
    }

    public void setTopLosers(LiveData<List<TopLoser>> topLosers) {
        this.topLosers = topLosers;
    }

}
