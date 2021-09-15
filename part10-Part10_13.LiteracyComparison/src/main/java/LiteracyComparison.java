
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Literacy> literacy = new ArrayList<>();

        try ( Scanner file = new Scanner(Paths.get("literacy.csv"))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String parts[] = row.split(",");
                if (parts[2].contains("female (%)")) {
                    literacy.add(new Literacy(Double.valueOf(parts[5]), parts[3], Integer.valueOf(parts[4]), "female"));
                } else {
                    literacy.add(new Literacy(Double.valueOf(parts[5]), parts[3], Integer.valueOf(parts[4]), "male"));
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }

        Collections.sort(literacy, (p1, p2) -> Double.compare(p1.percentage, p2.percentage));

        literacy.stream().forEach(p -> System.out.println(p.toString()));

    }

}
