/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class CustomTacoBox implements TacoBox{
    
    int tacos;
    
    public CustomTacoBox(int tacos) {
        
        this.tacos = tacos;
    }
    
    @Override
    public void eat() {
        
        if (this.tacos > 0) {
           this.tacos = this.tacos - 1;
         
        } 
        
    }
    
    @Override
    public int tacosRemaining() {
        
        return this.tacos;
    }
}
