package com.rbk.ish_tops;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.rbk.ish_tops.models.TopGainer;
import com.rbk.ish_tops.models.TopLoser;
import com.rbk.ish_tops.models.TrendingStocks;

import java.util.List;

public class StockViewModel extends AndroidViewModel {
    private StockRepository stockRepository;

    public StockViewModel(@NonNull Application application) {
        super(application);
        this.stockRepository = new StockRepository(application);
    }

    public LiveData<TrendingStocks> getTrendingStocks(){

        return stockRepository.getTrendingStocks();
    }

   public  LiveData<List<TopGainer>> getTopGainers(){

        return stockRepository.getTrendingStocks().getValue().getTopGainers();
   }

    public  LiveData<List<TopLoser>> getTopLosers(){

        return stockRepository.getTrendingStocks().getValue().getTopLosers();
    }
}
