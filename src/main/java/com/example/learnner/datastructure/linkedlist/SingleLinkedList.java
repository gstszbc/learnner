package com.example.learnner.datastructure.linkedlist;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class SingleLinkedList {
    //先初始化头节点，头节点不能动
    private HeroNode head = new HeroNode(0, "", "");

    //添加节点到单向链表
    //不考虑编号顺序时，
    // 1。找到当前链表的最后一个节点，
    // 2。将这个节点的next指向新节点
    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    /**
     * 根据顺序添加
     */
    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                //说明已经到链表最后
                break;
            }
            if (temp.next.no > heroNode.no) {//位置找到
                break;
            } else if (temp.next.no == heroNode.no) {//编号已经存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("编号已存在，不能添加");
        } else {//顺序不能反
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }

    /**
     * @param heroNode
     * @describe 修改节点
     */
    public void update(HeroNode heroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        boolean flag = false;
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                //链表遍历完
                break;
            }
            if (temp.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = heroNode.name;
            temp.nickname = heroNode.nickname;
        } else {
            System.out.println("没有找到编号为" + heroNode.no + "的数据");
        }

    }

    /**
     * @param no
     * @describe 删除节点
     */
    public void delete(int no) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {//
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没找到该编号的节点");
        }
    }

    /**
     * 显示链表，遍历
     */
    public void list() {
        //先判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            //判断是否为空
            if (temp == null) {
                break;
            }
            //输出节点信息
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
