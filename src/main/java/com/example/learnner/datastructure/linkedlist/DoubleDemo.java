package com.example.learnner.datastructure.linkedlist;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class DoubleDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        HeroNode2 heroNode1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 heroNode2 = new HeroNode2(2, "武松", "行者");
        HeroNode2 heroNode3 = new HeroNode2(3, "林冲", "豹子头");
        HeroNode2 heroNode4 = new HeroNode2(4, "杨志", "青面兽");


        //添加
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode3);
        doubleLinkedList.add(heroNode4);

        //遍历
        doubleLinkedList.list();

        //修改
        HeroNode2 heroNode21 = new HeroNode2(2, "张三", "法外狂徒");
        doubleLinkedList.update(heroNode21);
        //展示
        System.out.println();
        doubleLinkedList.list();

        //删除
        doubleLinkedList.delete(2);
        System.out.println();
        doubleLinkedList.list();
    }
}
