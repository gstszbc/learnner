package com.example.learnner.adapter;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class Phone {
    public void charging(IVoltage5v iVoltage5v) {
        if (iVoltage5v.output5V() == 5) {
            System.out.println("可以充电");
        } else if (iVoltage5v.output5V() > 5) {
            System.out.println("不能充电");
        }
    }
}
