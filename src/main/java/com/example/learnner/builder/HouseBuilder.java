package com.example.learnner.builder;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
