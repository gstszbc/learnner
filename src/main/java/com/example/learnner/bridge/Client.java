package com.example.learnner.bridge;

/**
 * Author: zhangbicheng
 * Date: 2022/8/1
 */

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.open();
        phone.call();
        Phone phone1 = new UpRightPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        Phone phone2 = new UpRightPhone(new Huawei());
        phone2.open();
        phone2.call();
    }
}
