package com.example.learnner.builder;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
