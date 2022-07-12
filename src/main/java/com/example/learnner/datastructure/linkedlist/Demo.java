package com.example.learnner.datastructure.linkedlist;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class Demo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "武松", "行者");
        HeroNode heroNode3 = new HeroNode(3, "林冲", "豹子头");
        HeroNode heroNode4 = new HeroNode(4, "杨志", "青面兽");
//        singleLinkedList.add(heroNode);
//        singleLinkedList.add(heroNode1);
//        singleLinkedList.add(heroNode2);
//        singleLinkedList.add(heroNode3);
        singleLinkedList.addByOrder(heroNode3);
        singleLinkedList.addByOrder(heroNode1);
        singleLinkedList.addByOrder(heroNode2);
        singleLinkedList.addByOrder(heroNode4);
        singleLinkedList.list();
        System.out.println();
        //测试修改
        HeroNode heroNode = new HeroNode(2, "张顺", "浪里白条");
        singleLinkedList.update(heroNode);
        singleLinkedList.list();
        System.out.println();
        //测试删除
        singleLinkedList.delete(1);
        singleLinkedList.list();
    }
}
