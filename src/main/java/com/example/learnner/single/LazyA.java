package com.example.learnner.single;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class LazyA {
    private static LazyA instance;

    private LazyA() {
    }

    public static LazyA getInstance() {
        if (instance == null) {
            instance = new LazyA();
        }
        return instance;
    }
}
