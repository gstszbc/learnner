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
     * @return
     * @describe 获取链表节点的有效个数
     */
    public int getSize(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        int len = 0;
        HeroNode temp = head.next;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
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

    /**
     * @return
     * @describe 获取头节点
     */
    public HeroNode getHead() {
        return head;
    }

    /**
     * @param head
     * @param index
     * @return
     * @describe 寻找倒数第K个节点
     */
    public HeroNode findLastIndexNode(HeroNode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getSize(head);
        // size-index位置，就是我们倒数第K个节点
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void reverse(HeroNode head) {
        //如果链表为空，或只有一个节点，无需反转
        if (head.next == null || head.next.next == null) {
            return;
        }
        //定义一个辅助节点，帮忙遍历
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverse = new HeroNode(0, "", "");
        while (cur != null) {
            next = cur.next;//先保存
            cur.next = reverse.next;//限制空
            reverse.next =  cur;
            cur = next;//后移
        }
        head.next = reverse.next;
    }
}
