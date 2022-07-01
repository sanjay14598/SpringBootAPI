package com.andoridrest.Springboot.app.entity;

public class RevenueResponse {

    private long thisweek;
    private long amount;

    public RevenueResponse(long thisweek, long amount) {
        this.thisweek = thisweek;
        this.amount = amount;
    }

    public RevenueResponse() {
    }

    public long getThisweek() {
        return thisweek;
    }

    public void setThisweek(long thisweek) {
        this.thisweek = thisweek;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RevenueResponse{" +
                "thisweek=" + thisweek +
                ", amount=" + amount +
                '}';
    }
}
