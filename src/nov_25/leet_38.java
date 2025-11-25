package nov_25;

public class leet_38 {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                char c = s.charAt(j);
                int cnt = 0;
                while (j < s.length() && s.charAt(j) == c) {
                    cnt++;
                    j++;
                }
                sb.append(cnt).append(c);
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        leet_38 s = new leet_38();
        System.out.println(s.countAndSay(1));
        System.out.println(s.countAndSay(4));
        System.out.println(s.countAndSay(6));
    }
}