
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> contents;
    
    public StorageFacility() {
        
        this.contents = new HashMap<>();
        
    }
    
    public void add(String unit, String item) { //adds the parameter item to the storage unit that is also given as a parameter.
        
        contents.putIfAbsent(unit, new ArrayList<>());
        contents.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) { //returns a list that contains all the items in the storage unit indicated by the parameter. If there is no such storage unit or it contains no items, the method should return an empty list.
     
        if (contents.get(storageUnit) == null) {
            return new ArrayList<String>();
        }
        
        return contents.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) { // removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain. If the storage unit would be empty after the removal, the method also removes the unit.
        
        contents.get(storageUnit).remove(item);
        
        if (contents.get(storageUnit).isEmpty()) {
            contents.remove(storageUnit);
        }
        
        
    }
    
    public ArrayList<String> storageUnits() { //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
        
        ArrayList<String> stUnits = new ArrayList<>();
        for (String a : contents.keySet()) {
            if (!contents.get(a).isEmpty()) {
                stUnits.add(a);
            }
        }
        
        return stUnits;
    }
    
}
