package nov_13;

import java.util.*;

public class leet_3394 {
    public static boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> xs = new ArrayList<>();
        List<int[]> ys = new ArrayList<>();
        for (int[] r : rectangles) {
            xs.add(new int[]{r[0], r[2]});
            ys.add(new int[]{r[1], r[3]});
        }
        return Math.max(count(xs), count(ys)) >= 3;
    }

    private static int count(List<int[]> intervals) {
        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));
        int count = 0, prevEnd = 0;
        for (int[] i : intervals) {
            if (i[0] < prevEnd) prevEnd = Math.max(prevEnd, i[1]);
            else {
                prevEnd = i[1];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] rectangles = {
                {0, 0, 2, 2},
                {2, 0, 4, 2},
                {4, 0, 6, 2}
        };
        System.out.println(checkValidCuts(n, rectangles));
    }
}