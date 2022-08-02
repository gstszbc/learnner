package com.example.learnner.factory;

import java.io.Serializable;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class Pizza implements Cloneable, Serializable {
    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        Object pizza = null;
        try {
            pizza = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pizza;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
