package com.example.learnner.factory;

import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class TestA {
    public static void main(String[] args) {
//        Fruit apple = new Fruit("apple", 110);
//        Fruit orange = new Fruit("orange", 200);
//        Fruit peach = new Fruit("peach", 300);
//        List<Fruit> fruits = Arrays.asList(apple, orange, peach);
//        List<String> collect = fruits.stream().filter(f -> f.getCalories() > 50).sorted(Comparator.comparing(Fruit::getCalories).reversed())
//                .map(Fruit::getName).collect(Collectors.toList());
//        for (String name : collect
//        ) {
//            System.out.println(name);
//        }
//        Calendar calendar =  Calendar.getInstance();
        Pizza pizza = new Pizza("peer");
        Pizza clone1 = (Pizza) pizza.clone();
        Pizza clone2 = (Pizza) pizza.clone();
        Pizza clone3 = (Pizza) pizza.clone();
        Pizza clone4 = (Pizza) pizza.clone();
        System.out.println(pizza.hashCode());
        System.out.println(clone1.hashCode());
        System.out.println(clone2.hashCode());
        System.out.println(clone3.hashCode());
        System.out.println(clone4.hashCode());
        System.out.println(pizza);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

    }

}

class Fruit implements Comparable<Fruit> {
    private String name;
    private int calories;

    public Fruit(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.calories - o.calories;
    }
}