package dec_19;

public class leet_96 {
    public static void main(String[] args) {
        System.out.println(numTrees(3)); // 5
        System.out.println(numTrees(5)); // 42
    }

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}