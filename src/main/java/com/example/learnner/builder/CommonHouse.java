package com.example.learnner.builder;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
//
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("普通房子5米地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10米");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶大吉");
    }
}
