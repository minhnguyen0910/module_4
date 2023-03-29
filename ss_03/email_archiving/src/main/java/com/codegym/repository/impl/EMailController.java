package com.codegym.repository.impl;

import com.codegym.repository.IEMailController;

public class EMailController implements IEMailController {

    public String[] selectLanguage() {
        String[] languages = new String[]{"English", "Vietnamese", "Japans", "Chinese"};
        return languages;
    }

    public Integer[] selectSize() {
        Integer[] size = new Integer[]{5, 10, 15, 25, 50, 100};
        return size;
    }
}
