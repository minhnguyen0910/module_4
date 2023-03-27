package com.codegym.repository;

import java.security.Signature;
import java.util.ArrayList;

public class DictionaryRepository implements IDictionaryRepository {

    public String search(String vietnamese) {
        String[] listVietnamese = {"một", "hai", "ba", "bốn", "năm"};
        String[] listEnglish = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < listVietnamese.length; i++) {
            if (vietnamese.toLowerCase().equals(listVietnamese[i].toLowerCase())) {
                return listEnglish[i];
            }
        }
        return null;
    }
}
