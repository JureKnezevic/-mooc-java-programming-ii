package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String org = scanner.nextLine();
        String course = scanner.nextLine();
        
        Application.launch(UserTitle.class, "--organization=" + org, "--course=" + course);
        
    }
}