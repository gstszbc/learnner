package com.example.learnner.command;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setFood("宫保鸡丁", 1);
        order1.setFood("可乐", 1);
        order1.setDiningTable(1);

        Order order2 = new Order();
        order2.setFood("酸菜鱼", 1);
        order2.setFood("雪碧", 1);
        order2.setDiningTable(1);

        Chef chef = new Chef();
        OrderCommand orderCommand1 = new OrderCommand(chef, order1);
        OrderCommand orderCommand2 = new OrderCommand(chef, order2);
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);

        waiter.orderUp();


    }
}
