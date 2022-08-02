package com.example.learnner.adapter;

/**
 * Author: zhangbicheng
 * Date: 2022/7/29
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5v {

    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
