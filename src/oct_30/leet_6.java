package oct_30;

public class leet_6 {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = sol.convert(s, numRows);
        System.out.println(result);  // expected: "PAHNAPLSIIGYIR"
    }
}

class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
        int cur = 0, dir = 1;
        for (char c : s.toCharArray()) {
            rows[cur].append(c);
            if (cur == 0) dir = 1;
            else if (cur == numRows - 1) dir = -1;
            cur += dir;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder r : rows) ans.append(r);
        return ans.toString();
    }
}
