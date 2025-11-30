package nov_30;

public class leet_171 {
    public static void main(String[] args) {
        Solution171 sol = new Solution171();
        System.out.println(sol.titleToNumber("A"));   // 1
        System.out.println(sol.titleToNumber("AB"));  // 28
        System.out.println(sol.titleToNumber("ZY"));  // 701
    }
}

class Solution171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }
}