package oct_15;

import java.util.ArrayList;
import java.util.List;

public class leet_131 {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> currentList, List<List<String>> result) {
        // Base case: reached end of string
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        // Explore all possible substrings starting from 'start'
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                // Choose
                currentList.add(s.substring(start, end + 1));
                // Explore
                backtrack(end + 1, s, currentList, result);
                // Unchoose (backtrack)
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    // Helper function to check if substring s[l..r] is palindrome
    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Main method to test
    public static void main(String[] args) {
        leet_131 sol = new leet_131();
        System.out.println(sol.partition("aab"));
        System.out.println(sol.partition("a"));
        System.out.println(sol.partition("abba"));
    }
}
