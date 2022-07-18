package com.example.learnner.datastructure.recursion;

import java.util.Arrays;

/**
 * Author: zhangbicheng
 * Date: 2022/7/15
 */
public class EightQueen {
    int max = 8;
    int[] arr = new int[max];
    static int count= 0;

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.check(0);
        System.out.println(count);
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //先把当前皇后
            arr[n] = i;
            if (judge(n)) {//不冲突
                check(n + 1);
            }
        }
    }

    private boolean judge(int n) {
        //说明
        //1.arr[i]==arr[n],表示第n个皇后是否和前面的n-1个皇后在同一行
        //2.Math.abs(n - i) == Math.abs(arr[n] - arr[i]))，表示判断第n个皇后是否和是否和第i皇后在同一斜线
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
