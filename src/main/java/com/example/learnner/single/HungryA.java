package com.example.learnner.single;

/**
 * 饿汉式
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class HungryA {
    private final static HungryA instance = new HungryA();

    private HungryA() {
    }

    public static HungryA getInstance() {
        return instance;
    }
}
