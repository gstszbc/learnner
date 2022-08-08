package com.example.learnner.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Client {
    public static void main(String[] args) {
        //春节来了
        SaleMan saleMan = new SaleMan(new StrategyA());
        saleMan.saleManShow();
        System.out.println("-------------");
        //中秋
        saleMan.setStrategy(new StrategyB());
        saleMan.saleManShow();
        System.out.println("-------------");
        //五一
        saleMan.setStrategy(new StrategyC());
        saleMan.saleManShow();

        Integer[] arrs = {1, 6, 2, 0, 43, 21, 4};
        Arrays.sort(arrs, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arrs));


    }
}
