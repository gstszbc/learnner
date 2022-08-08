package com.example.learnner.responsibility;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("经理 审批通过");
    }
}
