import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class FileStats {
public static void main(String[] args) {
String fileName = "File1.txt";
int wordCount = 0;
int charCount = 0;
int lineCount = 0;

try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
lineCount++;
String[] words = line.trim().split("\\s+");
wordCount += words.length;
for (String word : words) {
charCount += word.length();
}
}
} catch (IOException e) {
System.err.println("Error reading file: " + e.getMessage());
return;
}

System.out.println("Word count: " + wordCount);
System.out.println("Character count: " + charCount);
System.out.println("Line count: " + lineCount);
}
}
