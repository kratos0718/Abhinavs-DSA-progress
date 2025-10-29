package oct_29;

public class leet_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] lps = buildLps(needle);
        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                if (j == needle.length()) return i - j;
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return -1;
    }

    private static int[] buildLps(String p) {
        int n = p.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issi";
        int index = strStr(haystack, needle);
        System.out.println("Index of substring: " + index);
    }
}
