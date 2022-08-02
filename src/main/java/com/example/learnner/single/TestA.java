package com.example.learnner.single;

import com.example.learnner.factory.Pizza;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class TestA {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


//        Runtime
        Pizza pizza = new Pizza("peer");

    }
}
