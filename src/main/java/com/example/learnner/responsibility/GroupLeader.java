package com.example.learnner.responsibility;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("小组长审批通过");
    }
}
