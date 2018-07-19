package com.dinner3000.demo.designpattern.singleton;

public class EarlyMode {
    private static final EarlyMode instance = new EarlyMode();

    public static EarlyMode getInstance() {
        return instance;
    }

    private EarlyMode(){}
}
