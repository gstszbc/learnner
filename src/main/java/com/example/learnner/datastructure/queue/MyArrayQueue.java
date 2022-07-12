package com.example.learnner.datastructure.queue;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class MyArrayQueue {
    private int maxSize;//数组最大容量
    private int front;//队头
    private int rear;//队尾
    private int[] arr;//队列

    /**
     * @param arrMaxSize
     * @describe 构造函数
     */
    public MyArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头的前一个位置
        rear = -1;//指向最后一个元素
    }

    /**
     * @return true/false
     * @describe 队列是否满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * @return true/false
     * @describe 队列是否为空
     */
    public boolean isNull() {
        return rear == front;
    }

    /**
     * @param number
     * @describe 添加数据到队列
     */
    public void addQueue(int number) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = number;
    }

    /**
     * @describe 出队列
     * @return
     */
    public int getQueue() {
        if (isNull()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }

    /**
     *
     */
    public void show(){
        if (isNull()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
