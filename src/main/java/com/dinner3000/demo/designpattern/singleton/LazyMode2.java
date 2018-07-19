package com.dinner3000.demo.designpattern.singleton;

public class LazyMode2 {
    private static LazyMode2 instance;

    private LazyMode2() {
    }

    public static synchronized LazyMode2 getInstance() {//Low performance for read access
        if (instance == null) {
            instance = new LazyMode2();
        }
        return instance;
    }

}
