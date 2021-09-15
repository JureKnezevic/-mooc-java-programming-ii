
import java.util.Comparator;


public class BySuitInValueOrder implements Comparator<Card>{
    
    @Override
    public int compare(Card c1, Card c2) {
        
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        
        if (suitComparison == 0) {
            return c1.compareTo(c2);  
        } else {
            return suitComparison;
        }
    }
}




/*
if (this.value > card.getValue()) {
            return 1;

        } else if (this.value == card.getValue()) {
            if (this.suit.ordinal() > card.getSuit().ordinal()) {
                return 1;
            } else if (this.suit.ordinal() == card.getSuit().ordinal()) {
                return 0;
            } else {
                return -1;
            }
        } else {     
            return -1;
        }
*/