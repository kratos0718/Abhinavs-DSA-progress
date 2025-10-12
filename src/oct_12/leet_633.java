package oct_12;
import java.util.*;
public class leet_633 {
    public static boolean square(int c){
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right){
            long sum = left*left + right*right;
            if (sum == c) return true;
            if(sum<c) left++;
            else right --;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long c = sc.nextLong();
        if(c<0){
            System.out.println("false");
            return;
        }
        boolean ans = square((int)c);
        System.out.println(ans ? "true" : "false");
        sc.close();
    }
}
