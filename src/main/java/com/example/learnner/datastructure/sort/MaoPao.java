package com.example.learnner.datastructure.sort;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Author: zhangbicheng
 * Date: 2022/7/18
 */
public class MaoPao {
    public static void main(String[] args) {
//        int[] arr = {1, 9, 45, 2, 356};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " + arr[i]);
//        }
//        mao(arr);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " + arr[i]);
//        }
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) Math.random() * 8000000;
        }
        LocalDateTime start = LocalDateTime.now();
        mao(arr);
        LocalDateTime end = LocalDateTime.now();
        System.out.println(start);
        System.out.println(end);
    }

    /**
     * 时间复杂度n的平方
     * 还是不优化了
     *
     * @param arr
     */
    public static void mao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

