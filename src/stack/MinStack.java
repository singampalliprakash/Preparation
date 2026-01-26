package stack;

import java.util.*;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        st.push(val);

        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        st.pop();
        min.pop();
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        if (min.isEmpty()) {
            return -1;
        }
        return min.peek();
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println("Min: " + obj.getMin()); // -3

        obj.pop();

        System.out.println("Top: " + obj.top());   // 0
        System.out.println("Min: " + obj.getMin()); // -2

        obj.push(-1);
        System.out.println("Top: " + obj.top());   // -1
        System.out.println("Min: " + obj.getMin()); // -2
    }
}

