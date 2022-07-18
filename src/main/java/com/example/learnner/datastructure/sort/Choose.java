package com.example.learnner.datastructure.sort;

import java.time.LocalDateTime;

/**
 * Author: zhangbicheng
 * Date: 2022/7/18
 */
public class Choose {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 89, 43};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        chooseSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    /**
     * 时间复杂度n的平方
     * 还是不优化了
     *
     * @param arr
     */
    public static void chooseSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {//优化判断
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}

