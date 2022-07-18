package com.example.learnner.datastructure.stack;

/**
 * Author: zhangbicheng
 * Date: 2022/7/15
 */
public class Calculator {


}

class ArrayStack2 {
    private int[] stack;
    private int maxSize;
    private int top = -1;

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int num) {
        //判断stack是否已满
        if (isFull()) {
            System.out.println("栈已经满了");
            return;
        }
        top++;
        stack[top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("栈已经空了");
            throw new RuntimeException("栈已经空了");
        }
        int num = stack[top];
        top--;
        return num;
    }

    public void showStack() {
        //从栈顶开始显示数据
        if (isEmpty()) {
            System.out.println("没有数据");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("index is: " + i + "  value is: " + stack[i]);
        }
    }

}