package dec_20;

public class leet_32 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));     // 2
        System.out.println(longestValidParentheses(")()())"));  // 4
    }

    public static int longestValidParentheses(String s) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}