package com.example.learnner.datastructure.recursion;

/**
 * Author: zhangbicheng
 * Date: 2022/7/15
 */
public class One {
    public static void main(String[] args) {
        test(4);
        System.out.println();
        int multi = multi(10);
        System.out.println(multi);
    }

    /**
     * @param n
     * @describe 打印问题
     */
    public static void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println(n);
    }

    public static int multi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * multi(n - 1);
        }
    }
}
