package oct_13;

import java.util.*;

public class leet_2125 {


    public static void main(String[] args) {

        String[] bank = {"011001", "000000", "010100", "001000"};

        leet_2125 sol = new leet_2125();
        int result = sol.numberOfBeams(bank);

        System.out.println("Number of laser beams: " + result);
    }


    public int numberOfBeams(String[] bank) {
        int prev = 0;   // number of devices ('1') in the previous non-empty row
        int ans = 0;

        for (String row : bank) {
            int cur = countOnes(row);
            if (cur > 0) {
                ans += prev * cur;
                prev = cur;
            }
        }
        return ans;
    }

    // helper method to count '1's in a given string
    private int countOnes(String row) {
        int count = 0;
        for (char c : row.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}
