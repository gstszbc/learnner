package com.example.learnner.builder;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House house1 = houseDirector.constructHouse();
        StringBuilder stringBuilder = new StringBuilder("123");
    }
}
