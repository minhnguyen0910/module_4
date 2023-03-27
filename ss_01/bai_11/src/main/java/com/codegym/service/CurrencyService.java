package com.codegym.service;

import com.codegym.repository.CurrencyRepository;
import com.codegym.repository.ICurrencyRepository;

public class CurrencyService implements ICurrencyService {
    ICurrencyRepository iCurrencyRepository = new CurrencyRepository();

    @Override
    public double convertUSD(double vND) {
        return iCurrencyRepository.convertUSD(vND);
    }

    @Override
    public double convertVND(double uSD) {
        return iCurrencyRepository.convertVND(uSD);
    }
}
