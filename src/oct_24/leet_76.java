package oct_24;

import java.util.*;

public class leet_76 {

    // ✅ Find the minimum window substring
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int count = map.size(); // number of unique chars left to satisfy
        int minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) count--;
            }
            right++;

            while (count == 0) { // valid window found
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char temp = s.charAt(left);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    // 💡 Main method for testing
    public static void main(String[] args) {
        leet_76 solution = new leet_76();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = solution.minWindow(s, t);
        System.out.println("Minimum Window Substring Output: " + result);
    }
}
