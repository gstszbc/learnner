package com.example.learnner.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Order {
    private int diningTable;
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
