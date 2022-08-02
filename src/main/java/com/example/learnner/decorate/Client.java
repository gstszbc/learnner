package com.example.learnner.decorate;

import com.example.learnner.decorate.drink.Coffee;
import com.example.learnner.decorate.drink.Drink;
import com.example.learnner.decorate.drink.LongBlack;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */
public class Client {
    public static void main(String[] args) {
        Drink coffee = new LongBlack();
        System.out.println(coffee.getDesc());
        System.out.println(coffee.getPrice());
        coffee = new Milk(coffee);
        System.out.println(coffee.getDesc());
        System.out.println(coffee.getPrice());


    }
}
