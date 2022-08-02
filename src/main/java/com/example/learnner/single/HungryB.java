package com.example.learnner.single;

/**
 * 饿汉式
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class HungryB {
    private static HungryB instance;

    private HungryB() {
        instance = new HungryB();
    }

    public static HungryB getInstance() {
        return instance;
    }
}
