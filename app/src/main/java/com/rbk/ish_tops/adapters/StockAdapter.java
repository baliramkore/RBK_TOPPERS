package com.rbk.ish_tops.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.rbk.ish_tops.R;
import com.rbk.ish_tops.databinding.StockGainerListItemBinding;
import com.rbk.ish_tops.models.TopGainer;

import java.util.ArrayList;

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.StockViewHolder> {

    private Context context;
    private ArrayList<TopGainer> topGainerArrayList;

    public StockAdapter(Context context, ArrayList<TopGainer> topGainerArrayList) {
        this.context = context;
        this.topGainerArrayList = topGainerArrayList;
    }

    @NonNull
    @Override
    public StockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        StockGainerListItemBinding listItemBinding=
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
                ,R.layout.stock_gainer_list_item,
                        parent,false
                );

        return new StockViewHolder(listItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StockViewHolder holder, int position) {

        TopGainer topGainer=topGainerArrayList.get(position);
        holder.gainerListItemBinding.setGainer(topGainer);
    }

    @Override
    public int getItemCount() {
        return topGainerArrayList.size();
    }


    public class StockViewHolder extends RecyclerView.ViewHolder {

        StockGainerListItemBinding gainerListItemBinding;

        public StockViewHolder( StockGainerListItemBinding gainerListItemBinding) {
            super(gainerListItemBinding.getRoot());
            this.gainerListItemBinding = gainerListItemBinding;

            gainerListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
