package com.example.learnner.datastructure.sort;

import java.util.Arrays;

/**
 * Author: zhangbicheng
 * Date: 2022/7/18
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 89, 43};
        insertSort(arr);

    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
            System.out.println(Arrays.toString(arr));
        }
    }
}

