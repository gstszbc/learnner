package com.example.learnner.composite;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author: zhangbicheng
 * Date: 2022/8/2
 */
public class Client {
    public static void main(String[] args) {
        //大学
        OrganizationComponent university = new University("北京大学", "北大");
        //学院
        OrganizationComponent collage1 = new Collage("信息工程学院", "信息工程学院");
        OrganizationComponent collage2 = new Collage("计算机学院", "信息工程学院");
        //专业
        collage1.add(new Department("物联网", "物联网"));
        collage1.add(new Department("网络工程", "网络工程"));
        collage1.add(new Department("计算科学", "计算科学"));

        collage2.add(new Department("通信", "通信"));
        collage2.add(new Department("信息工程", "信息工程"));
        //
        university.add(collage1);
        university.add(collage2);

        university.print();


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "jack");
        hashMap.put(2, "lisa");
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "rose");
        map.putAll(hashMap);
        Set<Integer> integers = map.keySet();
        integers.stream().forEach(s -> System.out.println(map.get(s)));

    }
}
