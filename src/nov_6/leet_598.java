package nov_6;

public class leet_598 {

    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }

    public static void main(String[] args) {
        leet_598 solution = new leet_598();
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        int result = solution.maxCount(m, n, ops);
        System.out.println("Max Count: " + result);
    }
}