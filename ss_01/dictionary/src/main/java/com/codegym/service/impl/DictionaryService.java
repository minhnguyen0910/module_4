package com.codegym.service.impl;

import com.codegym.repository.impl.DictionaryRepository;
import com.codegym.repository.IDictionaryRepository;
import com.codegym.service.IDictionaryService;

public class DictionaryService implements IDictionaryService {
    IDictionaryRepository iDictionaryRepository = new DictionaryRepository();

    @Override
    public String search(String vietnamese) {
        return iDictionaryRepository.search(vietnamese);
    }
}
