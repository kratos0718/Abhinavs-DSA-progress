package nov_15;

import java.util.*;

public class leet_22 {
    public static void main(String[] args) {
        int n = 3;
        Solution22 sol = new Solution22();
        List<String> result = sol.generateParenthesis(n);
        System.out.println(result);
    }
}

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }
        if (open < max) backtrack(res, curr + "(", open + 1, close, max);
        if (close < open) backtrack(res, curr + ")", open, close + 1, max);
    }
}