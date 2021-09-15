
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> list;

    public Hand() {
        this.list = new ArrayList<>();
    }

    public void add(Card card) {
        list.add(card);
    }

    public void print() {
        list.stream().forEach(card -> System.out.println(card));

    }

    public void sort() {
        Collections.sort(list, (p1, p2) -> Double.compare(p1.compareTo(p2), p2.compareTo(p2)));
    }

    @Override
    public int compareTo(Hand hand) {

        int sum1 = 0;
        int sum2 = 0;

        for (Card card : this.list) {
            sum1 = sum1 + card.getValue();
        }

        for (Card card : hand.list) {
            sum2 = sum2 + card.getValue();
        }
        
        return sum1 - sum2;
        
    }
    
    public void sortBySuit() {
        
        Collections.sort(list, new BySuitInValueOrder());
    }
}
