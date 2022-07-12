package com.example.learnner.datastructure.queue;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class CycleArray {
    private int maxSize;//数组最大容量
    private int front;//队头
    private int rear;//队尾
    private int[] arr;//队列

    /**
     * @param arrMaxSize
     * @describe 构造函数
     */
    public CycleArray(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    /**
     * @return true/false
     * @describe 队列是否满
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
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
        arr[rear] = number;
        rear = (rear + 1) % maxSize;
    }

    /**
     * @return
     * @describe 出队列
     */
    public int getQueue() {
        if (isNull()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    /**
     *
     */
    public void show() {
        if (isNull()) {
            System.out.println("队列为空");
            return;
        }
        //从front开始遍历，遍历多少个元素
        for (int i = front; i < front + size(); i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

}
