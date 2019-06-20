package com.schlumpyj.thetahero;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.schlumpyj.thetahero.OptionsSubClasses.CallExpDateMap;
import com.schlumpyj.thetahero.OptionsSubClasses.OptionStrike;
import com.schlumpyj.thetahero.OptionsSubClasses.PutExpDateMap;

import java.util.Map;

public class OptionsData {

    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("strategy")
    @Expose
    private String strategy;
    @SerializedName("interval")
    @Expose
    private Object interval;
    @SerializedName("underlyingPrice")
    @Expose
    private Double underlyingPrice;
    @SerializedName("volatility")
    @Expose
    private Integer volatility;
    /*@SerializedName("callExpDateMap")
    @Expose
    private CallExpDateMap callExpDateMap;
    @SerializedName("putExpDateMap")
    @Expose
    private Map<String, OptionStrike> putExpDateMap;*/

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Object getInterval() {
        return interval;
    }

    public void setInterval(Object interval) {
        this.interval = interval;
    }

    public Double getUnderlyingPrice() {
        return underlyingPrice;
    }

    public void setUnderlyingPrice(Double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    public Integer getVolatility() {
        return volatility;
    }

    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    /*public CallExpDateMap getCallExpDateMap() {
        return callExpDateMap;
    }

    public void setCallExpDateMap(CallExpDateMap callExpDateMap) {
        this.callExpDateMap = callExpDateMap;
    }

    public Map<String, OptionStrike> getPutExpDateMap() {
        return putExpDateMap;
    }

    public void setPutExpDateMap(Map<String, > putExpDateMap) {
        this.putExpDateMap = putExpDateMap;
    }*/

}