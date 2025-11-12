package nov_12;

import java.util.*;

public class leet_2607 {
    public static void main(String[] args) {
        int[] arr = {1,4,1,3};
        int k = 2;
        System.out.println(new Solution2607().makeSubKSumEqual(arr, k));
    }
}

class Solution2607 {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;
        boolean[] vis = new boolean[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            List<Integer> cycle = new ArrayList<>();
            int j = i;
            while (!vis[j]) {
                vis[j] = true;
                cycle.add(arr[j]);
                j = (j + k) % n;
            }
            Collections.sort(cycle);
            int mid = cycle.get(cycle.size() / 2);
            for (int x : cycle) ans += Math.abs(x - mid);
        }
        return ans;
    }
}
