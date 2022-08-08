package com.example.learnner.responsibility;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 * 请假类
 */
public class LeaveRequest {
    private String name;
    private int num;
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
