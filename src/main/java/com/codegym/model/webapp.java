package com.codegym.model;

public class webapp {
    private String language;
    private int size;
    private boolean SpamFilter;
    private String signature;

    public webapp() {
    }

    public webapp(String language, int size, boolean spamFilter, String signature) {
        this.language = language;
        this.size = size;
        SpamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpamFilter() {
        return SpamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        SpamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
