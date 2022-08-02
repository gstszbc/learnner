package com.example.learnner.datastructure.sort;

import java.util.Arrays;

/**
 * Author: zhangbicheng
 * Date: 2022/7/19
 */
public class QuickSort {
    public static void main(String[] args) {
        //测试
        int[] arr = {2, 3, -1, 0, 88, 23, 12, 53};
        quickSortMethod(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快排
     */
    public static void quickSortMethod(int[] arr, int left, int right) {
        int l = left;//左下标
        int r = right;//左下标
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l > r) {
            while (arr[l] < pivot) {
                //找到大于pivot的值，才退出
                l += 1;
            }
            while (arr[r] > pivot) {
                //找到小于pivot的值，才退出
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) {
                r -= 1;
            }
            if (arr[r] == pivot) {
                l += 1;
            }

        }
    }
}
