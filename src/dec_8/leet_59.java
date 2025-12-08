package dec_8;

public class leet_59 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;
        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) res[top][j] = num++;
            top++;
            for (int i = top; i <= bottom; i++) res[i][right] = num++;
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) res[bottom][j] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res[i][left] = num++;
                left++;
            }
        }
        return res;
    }
}