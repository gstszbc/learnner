package com.example.learnner.strategy;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class StrategyA implements StrategyOne{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
