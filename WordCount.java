import java.sql.*;
import java.util.HashMap;
public class WordCount {
public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "myuser", "mypassword");
            Statement stmt = conn.createStatement();
            for (String word : wordCount.keySet()) {
                String sql = "INSERT INTO word_count (word, count) VALUES ('" + word + "', " + wordCount.get(word) + ")";
                stmt.executeUpdate(sql);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}