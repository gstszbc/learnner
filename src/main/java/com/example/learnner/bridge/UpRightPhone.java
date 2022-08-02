package com.example.learnner.bridge;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立手机打电话");
    }
}
