package dec_7;

import java.util.*;

public class leet_71 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));              // "/home"
        System.out.println(simplifyPath("/../"));                // "/"
        System.out.println(simplifyPath("/home//foo/"));         // "/home/foo"
        System.out.println(simplifyPath("/a/./b/../../c/"));     // "/c"
    }

    public static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");
        for (String p : parts) {
            if (p.equals("") || p.equals(".")) continue;
            if (p.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(p);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.insert(0, "/" + dir);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}