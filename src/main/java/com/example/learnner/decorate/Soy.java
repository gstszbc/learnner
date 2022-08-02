package com.example.learnner.decorate;

import com.example.learnner.decorate.drink.Drink;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Soy extends Decorate {
    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1.0f);
    }
}
