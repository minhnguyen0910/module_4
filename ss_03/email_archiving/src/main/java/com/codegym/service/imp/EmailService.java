package com.codegym.service.imp;

import com.codegym.repository.IEMailController;
import com.codegym.repository.impl.EMailController;
import com.codegym.service.IEmailService;

public class EmailService implements IEmailService {
    IEMailController ieMailController = new EMailController();

    @Override
    public String[] selectLanguage() {
        return ieMailController.selectLanguage();
    }

    @Override
    public Integer[] selectSize() {
        return ieMailController.selectSize();
    }
}
