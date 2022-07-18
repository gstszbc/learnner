package com.example.learnner.datastructure.recursion;

/**
 * Author: zhangbicheng
 * Date: 2022/7/15
 */
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        setWay(map, 1, 1);
        //展示地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 1.map表示地图
     * 2.i，j表示开始的坐标
     * 3.如果小球找到map[6][5],则说明找到通路
     * 4.约定：当map[i][j]为0表示该点没有走，1为墙，2为通路可以走，3为已经走过，但走不通
     * 5.在走迷宫时，需要制定一个策略下-》右-》上-》左
     *
     * @param map
     * @param i
     * @param j
     * @return
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {//向下走
                    return true;
                } else if (setWay(map, i, j + 1)) {//向右
                    return true;
                } else if (setWay(map, i - 1, j)) {//向上
                    return true;
                } else if (setWay(map, i, j - 1)) {//向左
                    return true;
                } else {
                    //说明走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {//map[i][j]!=0
                return false;
            }
        }
    }
}
