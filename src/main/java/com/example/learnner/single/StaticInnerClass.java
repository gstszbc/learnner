package com.example.learnner.single;

/**
 * Author: zhangbicheng
 * Date: 2022/7/27
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    private static class Inner {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }

    public StaticInnerClass getInstance() {
        return Inner.instance;
    }
}
