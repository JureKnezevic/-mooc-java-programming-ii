
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        
        this.capacity = capacity;
    }
    @Override
    public void add(Item item) {

        if (capacity - item.getWeight() >= 0) {
            capacity = capacity - item.getWeight();
            items.add(item);
        }
    }

    @Override
    public void add(ArrayList<Item> items) {

        for (Item item : items) {

            BoxWithMaxWeight.this.add(item);

        }
    }
    @Override
    public boolean isInBox(Item item) {

        return items.contains(item);
    }

}
