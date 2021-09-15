/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
import java.util.ArrayList;

public class Hideout <T>{
    
    private ArrayList<T> hidden;
    
    public Hideout() {
        this.hidden = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        hidden.set(0, toHide);
    }
    
    public T takeFromHideout() {
        
        if (hidden.isEmpty()) {
            return null;
        }
        T toReturn = hidden.get(0);
        hidden.remove(0);
        
        return toReturn;

    }
    
    public boolean isInHideout() {
        if (hidden.size() > 0) {
            return true;
        } 
        return false;
    }
}
