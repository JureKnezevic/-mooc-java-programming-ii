
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
public class MisplacingBox extends Box{
    
    private ArrayList<Item> items = new ArrayList<>();
    
    @Override
    public void add(Item item) {
        
        items.add(item);
        
    }

    @Override
    public void add(ArrayList<Item> items) {
        
        for (Item item : items) {

            MisplacingBox.this.add(item);

        }

        
    }
    @Override
    public boolean isInBox(Item item) {

        return false;
    }
}
