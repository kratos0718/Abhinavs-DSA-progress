package oct_26;

public class leet_5 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "racecar";
        System.out.println("Input: " + test1 + " -> " + longestPalindrome(test1));
        System.out.println("Input: " + test2 + " -> " + longestPalindrome(test2));
        System.out.println("Input: " + test3 + " -> " + longestPalindrome(test3));
    }
}
