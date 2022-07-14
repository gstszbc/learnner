package com.example.learnner.datastructure.linkedlist;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 pre;//前一个节点
    public HeroNode2 next;//后一个节点

    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
