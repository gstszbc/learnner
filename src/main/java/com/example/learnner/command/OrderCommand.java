package com.example.learnner.command;

import java.util.Map;
import java.util.Set;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class OrderCommand implements Command {
    //c持有接收者
    private Chef chef;
    //
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        //
        Set<String> strings = foodDir.keySet();
        for (String foodName : strings) {
            chef.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println("准备完毕");

    }
}
