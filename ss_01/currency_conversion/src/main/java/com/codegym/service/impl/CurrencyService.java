package com.codegym.service.impl;

import com.codegym.service.ICurrencyService;

public class CurrencyService implements ICurrencyService {
    @Override
    public double convertUSD(double vND) {
        return vND / 24000;
    }

    @Override
    public double convertVND(double uSD) {
        return uSD * 24000;
    }
}
