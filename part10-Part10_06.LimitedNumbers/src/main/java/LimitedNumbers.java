
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            
            if (Integer.valueOf(input) < 0) {
                break;
            } 
            
            numbers.add(Integer.valueOf(input));
                       
            
        }
        
        ArrayList<Integer> printNumbers = numbers.stream()              
                .filter(number -> number >= 1 && number <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
                
                
        for (int i = 0; i < printNumbers.size(); i++) {
            System.out.println(printNumbers.get(i));
        }
        
                

    }
}
