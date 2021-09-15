
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            

            System.out.print("> ");

            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add")) {
                int number = Integer.valueOf(parts[1]);
                if (number > 0) {
                    first = first + number;
                    if (first > 100) {
                        first = 100;
                    }
                }
            }
            
            if (parts[0].equals("move")) {
                if (first > 0) {
                    if (first >= Integer.valueOf(parts[1])) {
                        first = first - Integer.valueOf(parts[1]);
                        second = second + Integer.valueOf(parts[1]);
                        if (second > 100) {
                            second = 100;
                        }
                    } else if (first < Integer.valueOf(parts[1])) {
                        second = second + first;
                        first = 0;

                    }

                }
            
            }
            
            if (parts[0].equals("remove")) {

                second = second - Integer.valueOf(parts[1]);

                if (second < 0) {
                    second = 0;
                }

            }
        }
    }
}
