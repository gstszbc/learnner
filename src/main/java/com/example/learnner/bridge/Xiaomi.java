package com.example.learnner.bridge;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
