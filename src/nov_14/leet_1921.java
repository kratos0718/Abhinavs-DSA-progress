package nov_14;

import java.util.Arrays;

public class leet_1921 {
    public static void main(String[] args) {
        int[] dist = {1, 3, 5};
        int[] speed = {1, 1, 1};
        System.out.println(eliminateMaximum(dist, speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];
        for (int i = 0; i < n; i++) time[i] = (double) dist[i] / speed[i];
        Arrays.sort(time);
        for (int i = 0; i < n; i++) if (time[i] <= i) return i;
        return n;
    }
}