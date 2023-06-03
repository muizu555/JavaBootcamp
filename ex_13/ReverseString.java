import java.io.*;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
            writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder(line);
                reversedLine.reverse();
                writer.write(reversedLine.toString());
                writer.newLine();
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
