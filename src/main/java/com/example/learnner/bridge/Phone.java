package com.example.learnner.bridge;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }
}
