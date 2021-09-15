
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            input = parts[0];
            

            if (input.equals("quit")) {
                break;
            }
            if (input.equals("add")) {

                first.add(Integer.valueOf(parts[1]));

            }

            if (input.equals("remove")) {

                second.remove(Integer.valueOf(parts[1]));
            }

            if (input.equals("move")) {

                if (first.contains() >= Integer.valueOf(parts[1])) {
                    first.remove(Integer.valueOf(parts[1]));
                    second.add((Integer.valueOf(parts[1])));
                } else if (first.contains() > 0) {
                    second.add(first.contains());
                    first.remove(Integer.valueOf(parts[1]));
                    
                }
            }

        }
    }

}
