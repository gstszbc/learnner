package com.example.learnner.strategy;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class SaleMan {
    private StrategyOne strategy;

    public SaleMan(StrategyOne strategy) {
        this.strategy = strategy;
    }

    public void saleManShow() {
        strategy.show();
    }

    public StrategyOne getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyOne strategy) {
        this.strategy = strategy;
    }
}
