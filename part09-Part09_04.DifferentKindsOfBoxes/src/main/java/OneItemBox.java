
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
public class OneItemBox extends Box{
    
    private ArrayList<Item> items;
    
    public OneItemBox() {
        
        items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item) {
        
        if (items.size()== 0) {
            items.add(item);
        }
        
    }

    @Override
    public void add(ArrayList<Item> items) {
        
        for (Item item : items) {

            OneItemBox.this.add(item);

        }

        
    }
    @Override
    public boolean isInBox(Item item) {

        return items.contains(item);
    }
    
}
