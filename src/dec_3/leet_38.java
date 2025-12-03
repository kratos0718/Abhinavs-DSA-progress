package dec_3;

public class leet_38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(5)); // Example run
    }

    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = next(s);
        }
        return s;
    }

    private static String next(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        return sb.toString();
    }
}