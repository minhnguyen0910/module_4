package com.codegym.model;

public class Setting {
    String language;
    Integer size;
    Boolean spamFilter;
    String signature;

    public Setting() {
    }

    public Setting(String language, Integer size, String signature) {
        this.language = language;
        this.size = size;
        this.signature = signature;
    }

    public Setting(String language, Integer size, Boolean spamFilter, String signature) {
        this.language = language;
        this.size = size;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }
}
