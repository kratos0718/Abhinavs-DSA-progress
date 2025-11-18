package nov_18;

public class leet_69 {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) return mid;
            if (mid < x / mid) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("Sqrt of " + x + " is: " + mySqrt(x));
    }
}