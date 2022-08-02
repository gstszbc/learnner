package com.example.learnner.adapter;

/**
 * Author: zhangbicheng
 * Date: 2022/7/30
 */
public class VoltageAdapter2 implements IVoltage5v {
    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        System.out.println("适配完成");
        return dst;
    }
}
