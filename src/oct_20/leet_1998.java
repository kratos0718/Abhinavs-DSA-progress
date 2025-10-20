package oct_20;

import java.util.*;

public class leet_1998   {

    public static boolean gcdSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        UnionFind uf = new UnionFind(max + 1);

        // Smallest prime factor (Sieve)
        int[] spf = new int[max + 1];
        for (int i = 2; i <= max; i++) {
            if (spf[i] == 0) {
                for (int j = i; j <= max; j += i) {
                    if (spf[j] == 0) spf[j] = i;
                }
            }
        }

        for (int num : nums) {
            int temp = num;
            while (temp > 1) {
                int prime = spf[temp];
                uf.union(num, prime);
                while (temp % prime == 0) temp /= prime;
            }
        }

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < nums.length; i++) {
            if (uf.find(nums[i]) != uf.find(sorted[i])) return false;
        }
        return true;
    }

    static class UnionFind {
        int[] parent, rank;
        UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return;
            if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
            else if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
            else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 21, 3};
        int[] nums2 = {5, 2, 6, 2};

        System.out.println("Case 1: " + gcdSort(nums1)); // true
        System.out.println("Case 2: " + gcdSort(nums2)); // false
    }
}
