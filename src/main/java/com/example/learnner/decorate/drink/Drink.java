package com.example.learnner.decorate.drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 * 装饰者模式
 */
public abstract class Drink {
    private String desc;
    private float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract float cost();
}
