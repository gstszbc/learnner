package com.example.learnner.decorate;

import com.example.learnner.decorate.drink.Drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Decorate extends Drink {
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " && " + getPrice();
    }
}
