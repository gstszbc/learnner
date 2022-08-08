package com.example.learnner.strategy;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class StrategyC implements StrategyOne {
    @Override
    public void show() {
        System.out.println("满1000加1元换购任意两百以下商品");
    }
}
