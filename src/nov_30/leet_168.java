package nov_30;

public class leet_168 {
    public static void main(String[] args) {
        Solution168 sol = new Solution168();
        System.out.println(sol.convertToTitle(1));    // A
        System.out.println(sol.convertToTitle(28));   // AB
        System.out.println(sol.convertToTitle(701));  // ZY
    }
}

class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // shift to 0-indexed
            int rem = columnNumber % 26;
            sb.append((char)('A' + rem));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}