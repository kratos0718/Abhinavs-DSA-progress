package oct_26;
import java.util.*;

public class leet_20 {

    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else {
                if (st.isEmpty()) return false;
                char t = st.pop();
                if (c == ')' && t != '(') return false;
                if (c == '}' && t != '{') return false;
                if (c == ']' && t != '[') return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "([{}])";
        System.out.println("Input: " + test1 + " -> " + isValid(test1));
        System.out.println("Input: " + test2 + " -> " + isValid(test2));
        System.out.println("Input: " + test3 + " -> " + isValid(test3));
    }
}
