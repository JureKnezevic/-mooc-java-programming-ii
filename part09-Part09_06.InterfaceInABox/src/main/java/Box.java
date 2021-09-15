
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Box implements Packable{
    
    private double maxWeight;
    
    private ArrayList<Packable> items;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        
        this.items = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double weight = 0;
        
        for (Packable item : items) {
            weight = weight + item.weight();
        }
        
        return weight;
    }
    
    public void add(Packable packable) {
        
        if (weight() + packable.weight() <= maxWeight) {
            items.add(packable);
        }
        
    }
    
    public String toString() {
        
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
