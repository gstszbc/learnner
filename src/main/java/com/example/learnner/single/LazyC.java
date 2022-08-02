package com.example.learnner.single;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class LazyC {
    private static volatile LazyC instance;

    private LazyC() {
    }

    public static LazyC getInstance() {
        if (instance == null) {
            synchronized (LazyC.class) {
                if (instance == null) {
                    instance = new LazyC();
                }
            }
            instance = new LazyC();
        }
        return instance;
    }
}
