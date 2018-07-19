package com.dinner3000.demo.designpattern.singleton;

public class LazyMode3 {
    private static volatile LazyMode3 instance;

    private LazyMode3() {
    }

    public static LazyMode3 getInstance() {
        if (instance == null) {
            synchronized (LazyMode3.class) {
                if (instance == null) {
                    instance = new LazyMode3();
                }
            }
        }
        return instance;
    }

}
