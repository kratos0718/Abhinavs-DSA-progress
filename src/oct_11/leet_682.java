package oct_11;

import java.util.*;

public class leet_682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) sum += score;
        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations)); // Output: 30
    }
}
