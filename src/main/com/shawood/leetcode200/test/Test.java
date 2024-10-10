package main.com.shawood.leetcode200.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        /* 初始化栈 */
        Stack<Integer> mStack = new Stack<>();

        /* 元素入栈 */
        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        mStack.push(4);
        mStack.push(5);
        mStack.push(6);

        /* 访问栈顶元素 */
        int peek = mStack.peek();
        System.out.println(peek);
        System.out.println(mStack.isEmpty());

        while (!mStack.isEmpty()) {
            int pop = mStack.pop();
            System.out.println(pop);
        }
        System.out.println(mStack.pop());
    }
}