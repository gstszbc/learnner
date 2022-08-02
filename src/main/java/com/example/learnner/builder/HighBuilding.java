package com.example.learnner.builder;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("高楼的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼的墙壁");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶大吉");
    }
}
