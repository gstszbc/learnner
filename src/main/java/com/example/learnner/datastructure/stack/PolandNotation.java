package com.example.learnner.datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: zhangbicheng
 * Date: 2022/7/15
 */
public class PolandNotation {
    public static void main(String[] args) {
        //逆波兰表达式
        String string = "3 4 + 5 * 6 -";
        List<String> list = getList(string);
        int cal = cal(list);
        System.out.println(cal);


    }

    public static List<String> getList(String string) {
        ArrayList<String> strings = new ArrayList<>();
        String[] s = string.split(" ");
        for (String str : s) {
            strings.add(str);
        }
        return strings;
    }

    public static int cal(List<String> list) {
        Stack<String> stack = new Stack<>();
        for (String s : list
        ) {
            if (s.matches("\\d+")) {
                stack.push(s);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (s.equals("+")) {
                    res = num1 + num2;
                } else if (s.equals("-")) {
                    res = num1 - num2;
                } else if (s.equals("*")) {
                    res = num2 * num1;
                } else if (s.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                stack.push(res + "");
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
