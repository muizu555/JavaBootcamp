import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        int commandNumber = scanner.nextInt();
        for (int i = 0; i < commandNumber; i++) {
            String input = scanner.next();
            if (input.indexOf("replace") >= 0) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();

                String substitute = scanner.next();
                String change = text.substring(start, end + 1);
                text = text.replace(change, substitute);
            }
            else if (input.indexOf("reverse") >= 0) {
                int point1 = scanner.nextInt();
                int point2 = scanner.nextInt();
                String point1Text = text.substring(point1, point1 + 1);
                String point2Text = text.substring(point2, point2 + 1);

                text = text.replace(point1Text, point2Text);
                text = text.replace(point2Text, point1Text);
            }
            else if (input.indexOf("print") >= 0) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();

                String display = text.substring(start, end + 1);
                System.out.println(display);
            }
        }
    }
}