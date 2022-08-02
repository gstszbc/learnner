package com.example.learnner.decorate;

import com.example.learnner.decorate.drink.Drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Chocolate extends Decorate {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3.0f);
    }
}
