package com.example.learnner.datastructure.linkedlist;

/**
 * Author: zhangbicheng
 * Date: 2022/7/14
 */
public class DoubleLinkedList {
    private HeroNode2 head = new HeroNode2(0, "", "");

    public HeroNode2 getHead() {
        return head;
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
        HeroNode2 temp = head.next;
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

    public void add(HeroNode2 heroNode) {
        HeroNode2 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    /**
     * @param heroNode
     * @describe 修改节点
     */
    public void update(HeroNode2 heroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        boolean flag = false;
        HeroNode2 temp = head.next;
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
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {//
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            //可以删除
            //如果是最后一个节点，不用执行下面一句代码
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
            temp.pre.next = temp.next;
        }


    }
}
