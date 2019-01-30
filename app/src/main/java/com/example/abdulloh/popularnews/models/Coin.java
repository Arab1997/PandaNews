package com.example.abdulloh.popularnews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Coin {
    @SerializedName("id")
    @Expose
    private String status;

    @SerializedName("title")
    @Expose
    private int totalResult;

    @SerializedName("coin")
    @Expose
    private List<Article> coins;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public List<Article> getCoins() {
        return coins;
    }

    public void setCoins(List<Article> coins) {
        this.coins = coins;
    }
}
