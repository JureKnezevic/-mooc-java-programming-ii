
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    
    public static void printKeys(HashMap<String,String> hashmap) { //prints all the keys in the hashmap gives as a parameter
        for (String print : hashmap.keySet()) {
            System.out.println(print);
        }
        
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) { //prints the keys in the hashmap gives as a parameter, which contain the string as a parameter
        for (String print : hashmap.keySet()) {
            if (print.contains(text)) {
                System.out.println(print);
            }
        }
        
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) { //prints the values in the given hashmap whichs keys contain the given string
        for (String print : hashmap.keySet()) {
            if (print.contains(text)) {
                System.out.println(hashmap.get(print));
            }
        }
        
        
    }

}
