package com.dinner3000.demo.designpattern.singleton;

public class LazyMode1 {
    private static LazyMode1 instance;

    private LazyMode1(){}

    public static LazyMode1 getInstance() {
        if(instance == null){//Concurrent issue
            instance = new LazyMode1();
        }
        return instance;
    }

}
