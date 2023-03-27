package com.codegym.service;

import com.codegym.repository.DictionaryRepository;
import com.codegym.repository.IDictionaryRepository;

public class DictionaryService implements IDictionaryService {
    IDictionaryRepository iDictionaryRepository = new DictionaryRepository();

    @Override
    public String search(String vietnamese) {
        return iDictionaryRepository.search(vietnamese);
    }
}
