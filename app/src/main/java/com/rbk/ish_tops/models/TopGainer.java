
package com.rbk.ish_tops.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rbk.ish_tops.BR;

public class TopGainer extends BaseObservable {

    @SerializedName("ticker_id")
    @Expose
    private String tickerId;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("percent_change")
    @Expose
    private String percentChange;
    @SerializedName("net_change")
    @Expose
    private String netChange;
    @SerializedName("bid")
    @Expose
    private String bid;
    @SerializedName("ask")
    @Expose
    private String ask;
    @SerializedName("high")
    @Expose
    private String high;
    @SerializedName("low")
    @Expose
    private String low;
    @SerializedName("open")
    @Expose
    private String open;
    @SerializedName("low_circuit_limit")
    @Expose
    private String lowCircuitLimit;
    @SerializedName("up_circuit_limit")
    @Expose
    private String upCircuitLimit;
    @SerializedName("volume")
    @Expose
    private String volume;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("close")
    @Expose
    private String close;
    @SerializedName("bid_size")
    @Expose
    private String bidSize;
    @SerializedName("ask_size")
    @Expose
    private String askSize;
    @SerializedName("exchange_type")
    @Expose
    private String exchangeType;
    @SerializedName("lot_size")
    @Expose
    private String lotSize;
    @SerializedName("overall_rating")
    @Expose
    private String overallRating;
    @SerializedName("short_term_trends")
    @Expose
    private String shortTermTrends;
    @SerializedName("long_term_trends")
    @Expose
    private String longTermTrends;
    @SerializedName("year_low")
    @Expose
    private String yearLow;
    @SerializedName("year_high")
    @Expose
    private String yearHigh;
    @SerializedName("ric")
    @Expose
    private String ric;

    public String getTickerId() {
        return tickerId;
    }

    public void setTickerId(String tickerId) {
        this.tickerId = tickerId;
    }

    @Bindable
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
        notifyPropertyChanged(BR.companyName);
    }
    @Bindable
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getNetChange() {
        return netChange;
    }

    public void setNetChange(String netChange) {
        this.netChange = netChange;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getLowCircuitLimit() {
        return lowCircuitLimit;
    }

    public void setLowCircuitLimit(String lowCircuitLimit) {
        this.lowCircuitLimit = lowCircuitLimit;
    }

    public String getUpCircuitLimit() {
        return upCircuitLimit;
    }

    public void setUpCircuitLimit(String upCircuitLimit) {
        this.upCircuitLimit = upCircuitLimit;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getBidSize() {
        return bidSize;
    }

    public void setBidSize(String bidSize) {
        this.bidSize = bidSize;
    }

    public String getAskSize() {
        return askSize;
    }

    public void setAskSize(String askSize) {
        this.askSize = askSize;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public String getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(String overallRating) {
        this.overallRating = overallRating;
    }

    public String getShortTermTrends() {
        return shortTermTrends;
    }

    public void setShortTermTrends(String shortTermTrends) {
        this.shortTermTrends = shortTermTrends;
    }

    public String getLongTermTrends() {
        return longTermTrends;
    }

    public void setLongTermTrends(String longTermTrends) {
        this.longTermTrends = longTermTrends;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

}
