package com.example.learnner.responsibility;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("张三", 9, "肚子疼");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(leaveRequest);
    }
}
