package com.rbk.ish_tops;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.rbk.ish_tops.adapters.StockAdapter;
import com.rbk.ish_tops.databinding.ActivityMainBinding;
import com.rbk.ish_tops.models.TopGainer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<TopGainer> topGainers;

    private RecyclerView recyclerView;

    private StockAdapter stockAdapter;

    private SwipeRefreshLayout refreshLayout;
    private ActivityMainBinding mainBinding;
    private  StockViewModel stockViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        mainBinding= DataBindingUtil.setContentView(
                this,R.layout.activity_main
        );

        stockViewModel=new ViewModelProvider(this)
                .get(StockViewModel.class);

        getTopGainers();

        refreshLayout=mainBinding.swipeLayout;
        refreshLayout.setColorSchemeResources(R.color.black);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getTopGainers();
            }
        });


    }
    private void getTopGainers(){
        stockViewModel.getTopGainers().observe(this, new Observer<List<TopGainer>>() {
            @Override
            public void onChanged(List<TopGainer> gainersLiveData) {

                topGainers= (ArrayList<TopGainer>) gainersLiveData;
                displayGainerInRecyclerview();

            }
        });
    }

    private void displayGainerInRecyclerview() {
        recyclerView=mainBinding.recyclerView;
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(stockAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        stockAdapter.notifyDataSetChanged();



    }

}