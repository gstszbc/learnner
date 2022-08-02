package com.example.learnner.single;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class LazyB {
    private static LazyB instance;

    private LazyB() {
    }

    public static synchronized LazyB getInstance() {
        if (instance == null) {
            instance = new LazyB();
        }
        return instance;
    }
}
