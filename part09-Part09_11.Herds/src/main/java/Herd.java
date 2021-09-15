
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{ 
    
    private List<Movable> organisms;
    
    public Herd() {
        
        this.organisms = new ArrayList<>();
        
    }
    
    public void addToHerd(Movable movable) {
        
        organisms.add(movable);
        
    }
    
    @Override
    public void move(int dx, int dy) {
        
        for (Movable single : organisms) {
            single.move(dx, dy);
        }
        
    }
    
    @Override
    public String toString() {
        
        String output = "";
        
        for (Movable single : organisms) {
            output = single.toString() + "\n" + output;
        }
        
        return output;
    }
    
}
