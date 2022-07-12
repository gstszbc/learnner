package com.example.learnner.datastructure.queue;

import java.util.Scanner;

/**
 * Author: zhangbicheng
 * Date: 2022/7/12
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        CycleArray cycleArray = new CycleArray(4);
        Scanner scanner = new Scanner(System.in);
        char key = ' ';
        while (true) {
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    cycleArray.show();
                    break;
                case 'a':
                    int num = scanner.nextInt();
                    cycleArray.addQueue(num);
                    break;
                case 'g':
                    int queue = cycleArray.getQueue();
                    System.out.println(queue);
                    break;
                default:
                    break;
            }
        }
    }
}
