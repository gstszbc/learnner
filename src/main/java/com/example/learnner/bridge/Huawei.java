package com.example.learnner.bridge;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
