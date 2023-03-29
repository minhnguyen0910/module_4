package com.codegym.model;

public class Currency {
    private double vND;
    private double uSD;

    public Currency(double vND, double USD) {
        this.vND = vND;
        this.uSD = USD;
    }

    public Currency() {
    }

    public double getVND() {
        return vND;
    }

    public void setVND(double vND) {
        this.vND = vND;
    }

    public double getUSD() {
        return uSD;
    }

    public void setUSD(double uSD) {
        this.uSD = uSD;
    }
}
