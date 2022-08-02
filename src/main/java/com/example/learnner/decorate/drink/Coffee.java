package com.example.learnner.decorate.drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
