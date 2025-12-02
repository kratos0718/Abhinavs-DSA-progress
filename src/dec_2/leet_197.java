package dec_2;

public class leet_197 {
    public static void main(String[] args) {
        // LeetCode 197 is SQL-only. Here's the query for reference:
        String sql = "SELECT w1.Id " +
                "FROM Weather w1 " +
                "JOIN Weather w2 " +
                "ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1 " +
                "AND w1.Temperature > w2.Temperature;";
        System.out.println("LeetCode 197 Rising Temperature SQL:");
        System.out.println(sql);
    }
}