package com.dinner3000.demo.designpattern.singleton;

public class LazyMode4 {
    private static class InnerInstance{
        private static final LazyMode4 instance = new LazyMode4();
    }

    private LazyMode4() {
    }

    public static LazyMode4 getInstance() {
        return InnerInstance.instance;
    }

}
