package com.example.learnner.decorate;

import com.example.learnner.decorate.drink.Drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Milk extends Decorate{
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.0f);
    }
}
