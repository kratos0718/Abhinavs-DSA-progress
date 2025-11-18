package nov_9;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class leet_636 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 2;
        List<String> logs = new ArrayList<>(Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6"));

        int[] result = solution.exclusiveTime(n, logs);

        System.out.println("Exclusive times: " + Arrays.toString(result));
        // Expected output: Exclusive times: [3, 4]
    }

    static class Solution {
        public int[] exclusiveTime(int n, List<String> logs) {
            int[] res = new int[n];
            Stack<Integer> stack = new Stack<>();
            int prevTimestamp = 0;

            for (String log : logs) {
                String[] parts = log.split(":");
                int id = Integer.parseInt(parts[0]);
                String type = parts[1];
                int timestamp = Integer.parseInt(parts[2]);

                if (type.equals("start")) {
                    if (!stack.isEmpty()) {
                        res[stack.peek()] += timestamp - prevTimestamp;
                    }
                    stack.push(id);
                    prevTimestamp = timestamp;
                } else {
                    res[stack.peek()] += timestamp - prevTimestamp + 1;
                    stack.pop();
                    prevTimestamp = timestamp + 1;
                }
            }
            return res;
        }
    }

//commmit teatttt 
}