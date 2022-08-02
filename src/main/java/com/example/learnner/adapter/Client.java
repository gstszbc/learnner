package com.example.learnner.adapter;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter2(new Voltage220V()));
        phone.charging(new VoltageAdapter());
    }
}
