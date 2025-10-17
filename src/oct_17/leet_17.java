package oct_17;

import java.util.ArrayList;
import java.util.List;

public class leet_17 {

    private static final String[] MAP = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        backtrack(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    private static void backtrack(String digits, int idx, StringBuilder cur, List<String> ans) {
        if (idx == digits.length()) {
            ans.add(cur.toString());
            return;
        }
        int d = digits.charAt(idx) - '0';
        String letters = MAP[d];
        for (int i = 0; i < letters.length(); i++) {
            cur.append(letters.charAt(i));
            backtrack(digits, idx + 1, cur, ans);
            cur.deleteCharAt(cur.length() - 1); // backtrack
        }
    }

    // Test harness
    public static void main(String[] args) {
        String[] tests = {"23", "", "2", "79", "234"};
        System.out.println("Recursive (Backtracking) - LeetCode 17\n");
        for (String t : tests) {
            List<String> res = letterCombinations(t);
            System.out.println("Input: \"" + t + "\"");
            System.out.println("Output: " + res);
            System.out.println();
        }
    }
}
