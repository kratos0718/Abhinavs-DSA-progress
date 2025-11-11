package nov_11;

public class leet_3178 {
    public static void main(String[] args) {
        Solution3178 obj = new Solution3178();
        int n = 5, k = 7;
        System.out.println(obj.numberOfChild(n, k));
    }
}

class Solution3178 {
    public int numberOfChild(int n, int k) {
        int rt = 2 * (n - 1);
        int pos = k % rt;
        return pos < n ? pos : rt - pos;
    }
}
