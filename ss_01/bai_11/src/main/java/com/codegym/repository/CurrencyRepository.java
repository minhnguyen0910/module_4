package com.codegym.repository;

public class CurrencyRepository implements ICurrencyRepository{
    @Override
    public double convertUSD(double vND){
        return vND/24000;
    }
    @Override
    public double convertVND(double uSD){
        return uSD*24000;
    }
}
