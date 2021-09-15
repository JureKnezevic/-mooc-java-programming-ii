
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        
        changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public double maxValue() {
        
        if (changes.isEmpty()) {
            return 0;
        }
        
        Double biggest = changes.get(0);
        for (int i = 0; i < changes.size(); i++) {
            if (biggest < changes.get(i)) {
                biggest = changes.get(i);
            }
        }
        
        return biggest;
    }
    
    public double minValue() {
        
        if (changes.isEmpty()) {
            return 0;
        }
        
        Double smallest = changes.get(0);
        for (int i = 0; i < changes.size(); i++) {
            if (smallest > changes.get(i)) {
                smallest = changes.get(i);
            }
        }
        
        return smallest;
    }
    
    public double average() {
        
        double sum = 0;
        double average = 0;
        
        for (int i = 0; i < changes.size(); i++) {
            sum = sum + changes.get(i);
            average = sum / (i+1);
            
        }
        
        return average;
    }
    
    
    public String toString() {
        return String.valueOf(changes);
    }
    
    
    
}
