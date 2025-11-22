package nov_22;

import java.util.*;

public class leet_93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int start, List<String> path, List<String> res) {
        if (path.size() == 4 && start == s.length()) {
            res.add(String.join(".", path));
            return;
        }
        if (path.size() == 4 || start == s.length()) return;
        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) return;
            String num = s.substring(start, start + len);
            if (num.length() > 1 && num.charAt(0) == '0') return;
            if (Integer.parseInt(num) > 255) return;
            path.add(num);
            backtrack(s, start + len, path, res);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        leet_93 obj = new leet_93();
        String s = "25525511135";
        List<String> ips = obj.restoreIpAddresses(s);
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}