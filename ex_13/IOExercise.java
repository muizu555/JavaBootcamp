import java.io.*;

public class IOExercise {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number:");
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String input = stdin.readLine();
            stdin.close();

            double data = Double.parseDouble(input);
            double dataSqrt = Math.sqrt(data);
            System.out.println("Square root of " + data + " is " + dataSqrt);

            DataOutputStream out = new DataOutputStream(new FileOutputStream("number.data"));
            out.writeDouble(dataSqrt);
            out.close();
            System.out.println("The square root value " + dataSqrt + " is written to the file \"number.data \".");

            DataInputStream in = new DataInputStream(new FileInputStream("number.data"));
            double inData = in.readDouble();
            in.close();
            System.out.println("The value read from the file \"number.data\" is " + inData);

            double inDataSquare = inData*inData;
            System.out.println("Square of " + inData + " is " + inDataSquare);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}